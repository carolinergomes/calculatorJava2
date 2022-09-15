package com.example.projetoaula.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping(value = "/calculator")
public class SomaController {
     
    @GetMapping(value = "/{num1}/{num2}")
    public Integer Soma(@PathVariable Integer num1, @PathVariable Integer num2){
        return num1 + num2;
    }
    }
    
