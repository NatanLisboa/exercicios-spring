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

    private final FizzService fizzService;
    private final BuzzService buzzService;
    private final FizzBuzzService fizzBuzzService;

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

    @Override
    public int verifyNumberType(String numberType) {

        if (numberType.equalsIgnoreCase("Fizz")){
            return this.fizzService.sumAllFizzNumbers();
        } else if (numberType.equalsIgnoreCase("Buzz")){
            return this.buzzService.sumAllBuzzNumbers();
        } else if (numberType.equalsIgnoreCase("FizzBuzz")){
            return this.fizzBuzzService.sumAllFizzBuzzNumbers();
        }

        return 0;

    }
}
