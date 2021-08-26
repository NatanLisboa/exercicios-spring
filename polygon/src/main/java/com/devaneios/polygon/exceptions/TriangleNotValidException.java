package com.devaneios.polygon.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.BAD_REQUEST)
public class TriangleNotValidException extends IllegalArgumentException {

    public TriangleNotValidException(){
        super("O triângulo cadastrado não é válido! Por favor, recadastre o último lado com um outro valor.");
    }

}
