package com.example.docker;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;
@RestController
public class image {
    @GetMapping ("/image")
    public String getData() { return "Rahul's first docker imagess";}
}
