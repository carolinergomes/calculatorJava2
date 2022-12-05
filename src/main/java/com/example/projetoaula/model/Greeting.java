package com.example.projetoaula.model;

import lombok.Data;

@Data
public class Greeting {

    private Integer num1;
    private Integer num2;
    private Integer resultado;

    // public Greeting(Integer num1) {}

    public Integer resultadoSoma(Integer num1, Integer num2) {
        return num1 + num2;
    }
}
