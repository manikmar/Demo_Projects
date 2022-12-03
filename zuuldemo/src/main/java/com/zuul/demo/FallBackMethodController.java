package com.zuul.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FallBackMethodController {

    @GetMapping("/userFallBack")
    public String userFallBackMethod(){
        return "User Service is talking longer then Expected."+
        "Please try again later.";
    }

    @GetMapping("/orderFallBack")
    public String orderFallBackMethod(){
        return "Order Service is talking longer then Expected."+
                "Please try again later.";
    }
}
