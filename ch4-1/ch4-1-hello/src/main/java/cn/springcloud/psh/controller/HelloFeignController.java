package cn.springcloud.psh.controller;

import cn.springcloud.psh.service.HelloFeignService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloFeignController {
    @Autowired
    private HelloFeignService helloFeignService;
    @GetMapping(value = "/search/github")
    public String searchGithubRepoByStr(@RequestParam("str")String queryStr){
        System.out.println(helloFeignService.searchRepo(queryStr));
        return helloFeignService.searchRepo(queryStr);
    }
}
