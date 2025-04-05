package com.atbug.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    /**
     * say hello
     *
     * @return hardcoded hello world
     */
    @GetMapping("/hi")
    public String hello() {
        return "Hello, world";
    }

    /**
     * say hello to some guy
     *
     * @param name name of the guy you want to say hello
     * @return hello message
     */
    @GetMapping("/hi/{name}")
    public String helloTo(@PathVariable("name") String name) {
        return "Hello, " + name;
    }
}
