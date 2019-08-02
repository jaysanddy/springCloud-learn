package cn.springcloud.psh;

import cn.springcloud.psh.filter.FirstPreFilter;
import cn.springcloud.psh.filter.SecondPreFIlter;
import com.netflix.zuul.FilterFileManager;
import com.netflix.zuul.FilterLoader;
import com.netflix.zuul.groovy.GroovyCompiler;
import com.netflix.zuul.groovy.GroovyFileFilter;
import com.netflix.zuul.monitoring.MonitoringHelper;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

@SpringBootApplication
@EnableZuulProxy
@EnableDiscoveryClient
public class Ch81ZuulServerApplication {

    public static void main(String[] args) {
        SpringApplication.run(Ch81ZuulServerApplication.class, args);
    }

    @Bean
    public FirstPreFilter firstPreFilter(){
        return new FirstPreFilter();
    }

    @Bean
    public SecondPreFIlter secondPreFIlter(){
        return new SecondPreFIlter();
    }

//    @Component
//    public static class GroovyRunner implements CommandLineRunner{
//        @Override
//        public void run(String... args) throws Exception {
//            MonitoringHelper.initMocks();
//            FilterLoader.getInstance().setCompiler(new GroovyCompiler());
//            try{
//                FilterFileManager.setFilenameFilter(new GroovyFileFilter());
//
//            }catch (Exception e){
//                throw new RuntimeException(e);
//            }
//        }
//    }
}
