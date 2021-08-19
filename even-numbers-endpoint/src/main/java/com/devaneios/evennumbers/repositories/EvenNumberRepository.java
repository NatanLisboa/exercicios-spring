package com.devaneios.evennumbers.repositories;

import com.devaneios.evennumbers.model.EvenNumbersList;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@NoArgsConstructor
public class EvenNumberRepository {

    public void postEvenNumber(Integer number) {
        EvenNumbersList.addEvenNumber(number);
    }

    public List<Integer> getAllEvenNumbers() {
        return EvenNumbersList.getAllEvenNumbers();
    }
}
