package com.zx.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/service")
public class serviceIndexController {

    @RequestMapping(value = {"",""})
    public String index(){
        return "provider index";
    }
}
