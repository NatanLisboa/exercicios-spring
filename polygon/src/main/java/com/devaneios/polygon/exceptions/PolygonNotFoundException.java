package com.devaneios.polygon.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

import java.util.NoSuchElementException;

@ResponseStatus(HttpStatus.NOT_FOUND)
public class PolygonNotFoundException extends NoSuchElementException {

    public PolygonNotFoundException(){
        super("O polígono com o identificador informado não existe no banco de dados!");
    }

}
