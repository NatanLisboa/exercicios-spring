package com.devaneios.evennumbers.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value = HttpStatus.BAD_REQUEST)
public class OddNumberReceivedException extends IllegalArgumentException {

    public OddNumberReceivedException() {
        super("Não é possível cadastrar números ímpares");
    }

}
