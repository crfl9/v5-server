package com.crfl.v5.health.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author liuyang
 * 2020-07-07 19:26
 */
@RestController
@RequestMapping("/api")
public class HealthController {

    @GetMapping("health")
    public String health(){
        return "health";
    }
}
