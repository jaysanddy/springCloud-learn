package cn.springcloud.psh.ch41gzip.service;

import cn.springcloud.psh.ch41gzip.config.HelloFeignServiceConfig;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(name = "github-client", url = "https://api.github.com", configuration = HelloFeignServiceConfig.class)
public interface HelloFeignService {
    @GetMapping(value = "/search/repositories")
    ResponseEntity<byte[]> searchRepo(@RequestParam("q") String queryStr);
}
