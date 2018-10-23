package com.yiche.configclient.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;


public class HelloController {
    @Value("${App.server.address}")
    String ip;

    @RequestMapping("/hi")
    public String home(@RequestParam(value = "name", defaultValue = "liyang") String name) {
        return "hi " + name + " ,i am from address:" + ip;
    }
}
