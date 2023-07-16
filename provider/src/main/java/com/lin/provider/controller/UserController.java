package com.lin.provider.controller;

import com.lin.provider.service.UserService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @author lin
 * @version 01:02
 * @date 2023-07-16
 */

@RestController
@RequestMapping("/user")
public class UserController {
    @Resource
    private UserService userService;

    @GetMapping("/{name}")
    public String one(@PathVariable("name") String name){
        return userService.getUser(name);
    }
}
