package com.seun.whitelistip.api;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "api/v1/hello")
public class Controller {

    @GetMapping
    public String sayHello() {
        return "Hello whitelisted";
    }

    @PostMapping
    public void addIp() {

    }
}
