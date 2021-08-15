package com.devaneios.fizzbuzzfizzbuzz.services.impl;

import com.devaneios.fizzbuzzfizzbuzz.repositories.FizzRepository;
import com.devaneios.fizzbuzzfizzbuzz.services.FizzService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class FizzServiceImpl implements FizzService {

    private FizzRepository fizzRepository;

    @Override
    public void createFizzNumber(int number) {
        this.fizzRepository.createFizzNumber(number);
    }
}
