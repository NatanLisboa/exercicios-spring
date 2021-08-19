package com.devaneios.evennumbers.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;

@Getter
@Setter
@AllArgsConstructor
public class EvenNumbersList {

    private static ArrayList<Integer> evenNumbers = new ArrayList<>();

    public static void addEvenNumber(Integer number) {
        evenNumbers.add(number);
    }

    public static ArrayList<Integer> getAllEvenNumbers() {
        return evenNumbers;
    }

}
