package com.example.helloWorld;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class NewHello {
    @GetMapping("/hello")
    String NewHelo(){
        return "Hi Nemalesh";
    }

}
