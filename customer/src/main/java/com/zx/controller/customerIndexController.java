package com.zx.controller;

import com.zx.api.MyService;
import jdk.nashorn.internal.ir.annotations.Reference;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/customer")
public class customerIndexController {

    @Reference
    MyService myService;

    @RequestMapping(value = {"","/"})
    public String index(){
        return myService.pingMyService();
    }
}
