package cn.springcloud.psh.service;

import cn.springcloud.psh.model.User;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("/user")
public class UserService {
    @GetMapping(value = "/add")
    public String addUser(User user ){
        return "hello,"+user.getName();
    }

    @PutMapping(value = "/update")
    public String updateUser( @RequestBody User user){
        return "hello,"+user.getName();
    }
}
