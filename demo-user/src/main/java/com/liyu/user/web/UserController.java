package com.liyu.user.web;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author liyu
 * @date 2019/9/5 17:40
 * @description
 */
@RestController
@RequestMapping("/user")
public class UserController {

    @GetMapping("/hello")
    public String sayHello() {
        return "hello";
    }
}
