package com.atbug.demo.controller;

import org.springframework.ai.tool.annotation.Tool;
import org.springframework.ai.tool.annotation.ToolParam;
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
    @Tool(description = "say hello")
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
    @Tool(description = "say hello to some guy")
    public String helloTo(@PathVariable("name") @ToolParam(description = "name of the guy you want to say hello") String name) {
        return "Hello, " + name;
    }
}
