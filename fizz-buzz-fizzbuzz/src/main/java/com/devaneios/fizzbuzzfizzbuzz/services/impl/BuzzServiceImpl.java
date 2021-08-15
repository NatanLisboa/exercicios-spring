package com.devaneios.fizzbuzzfizzbuzz.services.impl;

import com.devaneios.fizzbuzzfizzbuzz.repositories.BuzzRepository;
import com.devaneios.fizzbuzzfizzbuzz.services.BuzzService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class BuzzServiceImpl implements BuzzService {

    private BuzzRepository buzzRepository;

    @Override
    public void createBuzzNumber(int number) {
        this.buzzRepository.createBuzzNumber(number);
    }

}
