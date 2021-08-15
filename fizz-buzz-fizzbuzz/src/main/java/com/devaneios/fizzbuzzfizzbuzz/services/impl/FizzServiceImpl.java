package com.devaneios.fizzbuzzfizzbuzz.services.impl;

import com.devaneios.fizzbuzzfizzbuzz.repositories.FizzRepository;
import com.devaneios.fizzbuzzfizzbuzz.services.FizzService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
@AllArgsConstructor
public class FizzServiceImpl implements FizzService {

    private final FizzRepository fizzRepository;

    @Override
    public void createFizzNumber(int number) {
        this.fizzRepository.createFizzNumber(number);
    }

    @Override
    public ArrayList<Integer> getAllFizzNumbers() {
        return this.fizzRepository.getAllFizzNumbers();
    }
}
