package cn.springcloud.psh.filter;

import com.netflix.zuul.ZuulFilter;
import com.netflix.zuul.context.RequestContext;
import com.netflix.zuul.exception.ZuulException;
import org.apache.http.protocol.RequestContent;

import javax.servlet.http.HttpServletRequest;
import java.util.Map;

import static org.springframework.cloud.netflix.zuul.filters.support.FilterConstants.PRE_TYPE;

public class SecondPreFIlter extends ZuulFilter {
    @Override
    public String filterType() {
        return PRE_TYPE;
    }

    @Override
    public int filterOrder() {
        return 0;
    }

    @Override
    public boolean shouldFilter() {
        return true;
    }

    @Override
    public Object run() throws ZuulException {
        System.out.println("这是SecondPreFilter !");
        //从RequestContext获取上下文
        RequestContext ctx = RequestContext.getCurrentContext();
        HttpServletRequest request = ctx.getRequest();
        String token =request.getHeader("token");
        String a =request.getParameter("a");
        if(a == null){
            //对该请求禁止路由，也就是禁止访问下游服务
            ctx.setSendZuulResponse(false);
            //设定respondeBody供PostFilter使用
            ctx.setResponseBody("{\"status\":500,\"message\":\"a参数为空!\"}");
            ctx.set("logic-is-success",false);
            return null;
        }
        ctx.set("logic-is-success",true);
        return null;
    }
}
