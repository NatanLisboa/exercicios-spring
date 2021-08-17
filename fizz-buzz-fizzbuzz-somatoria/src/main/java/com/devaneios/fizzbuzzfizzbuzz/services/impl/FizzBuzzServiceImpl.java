package com.devaneios.fizzbuzzfizzbuzz.services.impl;

import com.devaneios.fizzbuzzfizzbuzz.repositories.FizzBuzzRepository;
import com.devaneios.fizzbuzzfizzbuzz.services.FizzBuzzService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
@AllArgsConstructor
public class FizzBuzzServiceImpl implements FizzBuzzService {

    private final FizzBuzzRepository fizzBuzzRepository;

    @Override
    public void createFizzBuzzNumber(int number) {
        this.fizzBuzzRepository.createFizzBuzzNumber(number);
    }

    @Override
    public ArrayList<Integer> getAllFizzBuzzNumbers() {
        return this.fizzBuzzRepository.getAllFizzBuzzNumbers();
    }

    @Override
    public int sumAllFizzBuzzNumbers() {
        ArrayList<Integer> fizzBuzzNumbers = this.fizzBuzzRepository.getAllFizzBuzzNumbers();
        return fizzBuzzNumbers.stream()
                .reduce((e1, e2) -> e1 + e2).orElse(0);
    }
}
