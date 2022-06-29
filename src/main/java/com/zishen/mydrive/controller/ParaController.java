package com.zishen.mydrive.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ParaController {
    @GetMapping("/firstrequest")
    public String firstRequest(){
        return "Hello Spring Boot,我的第一个Spring Boot接口。";
    }
}
