package com.devaneios.fizzbuzzfizzbuzz.services.impl;

import com.devaneios.fizzbuzzfizzbuzz.repositories.BuzzRepository;
import com.devaneios.fizzbuzzfizzbuzz.services.BuzzService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
@AllArgsConstructor
public class BuzzServiceImpl implements BuzzService {

    private final BuzzRepository buzzRepository;

    @Override
    public void createBuzzNumber(int number) {
        this.buzzRepository.createBuzzNumber(number);
    }

    @Override
    public ArrayList<Integer> getAllBuzzNumbers() {
        return this.buzzRepository.getAllBuzzNumbers();
    }

}
