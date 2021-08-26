package com.devaneios.polygon.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.BAD_REQUEST)
public class PolygonNotValidException extends IllegalArgumentException {

    public PolygonNotValidException(){
        super("O polígono cadastrado não é válido! Por favor, reveja as suas características e tente novamente.");
    }

}
