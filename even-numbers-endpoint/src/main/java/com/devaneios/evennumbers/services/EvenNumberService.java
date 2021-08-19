package com.devaneios.evennumbers.services;

import java.util.List;

public interface EvenNumberService {

    void postEvenNumber(Integer number);

    List<Integer> getAllEvenNumbers();
}
