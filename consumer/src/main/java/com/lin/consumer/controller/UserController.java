package com.lin.consumer.controller;

import com.lin.provider.service.UserService;
import org.apache.dubbo.config.annotation.Reference;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author lin
 * @version 01:38
 * @date 2023-07-16
 */
@RestController
@RequestMapping("/user")
public class UserController {

    @Reference(version ="1.0.0")
    private UserService userService;

    @GetMapping("/{name}")
    public String one(@PathVariable("name") String name){
        return userService.getUser(name);
    }


}
