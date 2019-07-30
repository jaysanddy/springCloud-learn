package cn.springcloud.psh.controller;

import cn.springcloud.psh.model.User;
import cn.springcloud.psh.service.UserFeignService;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

@RestController
@RequestMapping("/user")
public class UserController {
    @Resource
    private UserFeignService userFeignService;

    @PostMapping(value = "/add")
    public String addUser(@RequestBody User user){
        return userFeignService.addUser(user);
    }

    @PutMapping(value = "/update")
    public String updateUser(@RequestBody User user){
        return userFeignService.updateUser(user);
    }
}
