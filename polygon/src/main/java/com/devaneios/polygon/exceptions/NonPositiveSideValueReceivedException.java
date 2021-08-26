package com.devaneios.polygon.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.BAD_REQUEST)
public class NonPositiveSideValueReceivedException extends IllegalArgumentException {

    public NonPositiveSideValueReceivedException(){
        super("Tamanho inválido! Por favor, insira um tamanho maior que 0 para o lado cadastrado.");
    }

}
