package com.devaneios.fizzbuzzfizzbuzz.controllers;

import com.devaneios.fizzbuzzfizzbuzz.services.StorageService;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

@RestController
@RequestMapping("/numbers")
@AllArgsConstructor
public class StorageController {

    private final StorageService storageService;

    @PostMapping
    public ResponseEntity<ArrayList<Integer>> createNumbers(@RequestBody ArrayList<Integer> numbers){
        numbers.forEach(this.storageService::chooseService);
        return ResponseEntity.ok(numbers);
    }
     

}
