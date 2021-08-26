package com.devaneios.polygon.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.CONFLICT)
public class AlreadyRegisteredPolygonException extends IllegalArgumentException {

    public AlreadyRegisteredPolygonException(){
        super("Já existe um polígono cadastrado com esse nome!");
    }

}
