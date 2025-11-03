package br.com.pcproject.PCP.controller;

import org.springframework.web.bind.annotation.*;

@org.springframework.web.bind.annotation.RestController
public class RestController {
    @GetMapping("/hello")
    public String hello(@RequestParam(value="name", defaultValue = "world") String name){
        return String.format("Hello %s!", name);
    }
}
