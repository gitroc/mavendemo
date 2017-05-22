package com.example.controller;

import org.springframework.web.bind.annotation.*;

/**
 * Created by roc on 2017/5/11.
 */
@RestController
public class HelloWorldController {
    @RequestMapping(value = "/sayHello", method = RequestMethod.POST, produces = "application/json")
    public String sayHello(@RequestParam String username) {
        String str = "Hello,"+username;
        return str;
    }

    @RequestMapping(value = "/users/{username}",method = RequestMethod.GET,consumes="application/json")
    public String getUser(@PathVariable String username){
        return "Welcome,"+username;
    }
}
