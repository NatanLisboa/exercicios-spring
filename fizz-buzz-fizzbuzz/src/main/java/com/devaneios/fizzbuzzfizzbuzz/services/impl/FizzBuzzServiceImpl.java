package com.devaneios.fizzbuzzfizzbuzz.services.impl;

import com.devaneios.fizzbuzzfizzbuzz.repositories.FizzBuzzRepository;
import com.devaneios.fizzbuzzfizzbuzz.services.FizzBuzzService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class FizzBuzzServiceImpl implements FizzBuzzService {

    private FizzBuzzRepository fizzBuzzRepository;

    @Override
    public void createFizzBuzzNumber(int number) {
        this.fizzBuzzRepository.createFizzBuzzNumber(number);
    }
}
