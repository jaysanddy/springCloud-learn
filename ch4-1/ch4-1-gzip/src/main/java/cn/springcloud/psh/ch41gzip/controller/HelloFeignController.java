package cn.springcloud.psh.ch41gzip.controller;

import cn.springcloud.psh.ch41gzip.service.HelloFeignService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;


@RestController
public class HelloFeignController {
    @Resource
    private HelloFeignService helloFeignService;
    @GetMapping(value = "/search/github")
    public ResponseEntity<byte[]> searchGithubRepoByStr(@RequestParam("str") String queryStr) {
        return helloFeignService.searchRepo(queryStr);
    }
}
