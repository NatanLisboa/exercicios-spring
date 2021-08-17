package com.devaneios.fizzbuzzfizzbuzz.controllers;

import com.devaneios.fizzbuzzfizzbuzz.dto.NumberTypeDto;
import com.devaneios.fizzbuzzfizzbuzz.services.StorageService;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@RestController
@RequestMapping("/numbers")
@AllArgsConstructor
public class StorageController {

    private final StorageService storageService;

    @GetMapping("/sum")
    public ResponseEntity<Integer> getSum(@RequestBody NumberTypeDto numberType){
        return ResponseEntity.ok(this.storageService.verifyNumberType(numberType.toString()));
    }

    @PostMapping
    public ResponseEntity<ArrayList<Integer>> createNumbers(@RequestBody ArrayList<Integer> numbers){
        numbers.forEach(this.storageService::chooseService);
        return ResponseEntity.ok(numbers);
    }
     

}
