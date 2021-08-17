package com.devaneios.fizzbuzzfizzbuzz.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class NumberTypeDto {

    private String numberType;

    @Override
    public String toString(){
        return numberType;
    }
}
