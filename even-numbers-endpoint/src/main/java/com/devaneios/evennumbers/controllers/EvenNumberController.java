package com.devaneios.evennumbers.controllers;
import com.devaneios.evennumbers.services.EvenNumberService;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/even-numbers")
@AllArgsConstructor
public class EvenNumberController {

    private final EvenNumberService evenNumberService;

    @GetMapping
    public ResponseEntity<List<Integer>> getAllEvenNumbers(){
        return ResponseEntity.ok(this.evenNumberService.getAllEvenNumbers());
    }

    @PostMapping(consumes = MediaType.TEXT_PLAIN_VALUE)
    public ResponseEntity<?> postEvenNumber(@RequestBody String number){
        this.evenNumberService.postEvenNumber(Integer.parseInt(number));
        return new ResponseEntity<>(HttpStatus.CREATED);
    }

}
