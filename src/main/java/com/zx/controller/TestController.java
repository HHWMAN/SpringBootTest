package com.zx.controller;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by ZX on 2018/9/19.
 *
 * @param
 * @return
 */

@RestController
public class TestController {

    @RequestMapping("/")
    String home() {
        return "Hello World!";
    }

  /*  public static void main(String[] args) throws Exception {
        SpringApplication.run(TestController.class, args);
    }*/
}
