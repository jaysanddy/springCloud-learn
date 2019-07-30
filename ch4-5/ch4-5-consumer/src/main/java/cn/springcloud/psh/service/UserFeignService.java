package cn.springcloud.psh.service;

import cn.springcloud.psh.model.User;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.*;

@FeignClient(name="ch4-5-provider")
public interface UserFeignService {
    @GetMapping(value="/user/add")
    String addUser(@RequestBody User user);
    @PutMapping(value = "/user/update")
    String updateUser(@RequestBody User user);
}
