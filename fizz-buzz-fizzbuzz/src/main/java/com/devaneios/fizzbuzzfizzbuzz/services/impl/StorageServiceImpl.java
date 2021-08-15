package com.devaneios.fizzbuzzfizzbuzz.services.impl;

import com.devaneios.fizzbuzzfizzbuzz.services.BuzzService;
import com.devaneios.fizzbuzzfizzbuzz.services.FizzBuzzService;
import com.devaneios.fizzbuzzfizzbuzz.services.FizzService;
import com.devaneios.fizzbuzzfizzbuzz.services.StorageService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class StorageServiceImpl implements StorageService {

    private FizzService fizzService;
    private BuzzService buzzService;
    private FizzBuzzService fizzBuzzService;

    @Override
    public void chooseService(int number) {

        if (number % 15 == 0) {
            this.fizzBuzzService.createFizzBuzzNumber(number);
        } else if (number % 5 == 0) {
            this.buzzService.createBuzzNumber(number);
        } else if (number % 3 == 0) {
            this.fizzService.createFizzNumber(number);
        }

    }
}
