package com.devaneios.evennumbers.services.impl;

import com.devaneios.evennumbers.exceptions.OddNumberReceivedException;
import com.devaneios.evennumbers.repositories.EvenNumberRepository;
import com.devaneios.evennumbers.services.EvenNumberService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class EvenNumberServiceImpl implements EvenNumberService{

    private EvenNumberRepository evenNumberRepository;

    @Override
    public void postEvenNumber(Integer number) {
        if (number % 2 != 0){
            throw new OddNumberReceivedException();
        }
        this.evenNumberRepository.postEvenNumber(number);
    }

    @Override
    public List<Integer> getAllEvenNumbers() {
        return this.evenNumberRepository.getAllEvenNumbers();
    }

}
