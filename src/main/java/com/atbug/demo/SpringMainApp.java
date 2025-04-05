package com.atbug.demo;

import com.atbug.demo.controller.HelloController;
import com.atbug.demo.controller.UserController;
import org.springframework.ai.tool.ToolCallbackProvider;
import org.springframework.ai.tool.method.MethodToolCallbackProvider;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class SpringMainApp {
    public static void main(String[] args) {
        SpringApplication.run(SpringMainApp.class, args);
    }

    @Bean
    ToolCallbackProvider toolCallbackProvider(UserController userController, HelloController helloController) {
        return MethodToolCallbackProvider.builder()
                .toolObjects(userController, helloController)
                .build();
    }
}