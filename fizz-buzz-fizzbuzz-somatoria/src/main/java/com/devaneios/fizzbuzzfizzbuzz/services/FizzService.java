package com.devaneios.fizzbuzzfizzbuzz.services;

import java.util.ArrayList;

public interface FizzService {

    void createFizzNumber(int number);

    ArrayList<Integer> getAllFizzNumbers();

    int sumAllFizzNumbers();
}
