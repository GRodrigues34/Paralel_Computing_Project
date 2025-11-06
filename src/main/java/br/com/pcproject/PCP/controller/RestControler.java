package br.com.pcproject.PCP.controller;

import org.springframework.web.bind.annotation.*;


@org.springframework.web.bind.annotation.RestController
public class RestControler {
    @GetMapping("/")
    public String hello(){
        return "Hello World";
    }
}
