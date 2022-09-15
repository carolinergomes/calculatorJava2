package com.example.projetoaula.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.example.projetoaula.model.Greeting;
import com.example.projetoaula.model.Resultado;

import org.springframework.http.HttpStatus;

@RestController
@RequestMapping(value = "greeting")

public class GreetingController {

    @PostMapping("")
    @ResponseStatus(HttpStatus.CREATED)

    public Resultado soma(@RequestBody Greeting greeting){
        Resultado r = new Resultado();
        r.setResultado(greeting.getNum1() + greeting.getNum2());
        return r;
    }
}

