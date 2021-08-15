package com.devaneios.fizzbuzzfizzbuzz.controllers;

import com.devaneios.fizzbuzzfizzbuzz.services.FizzBuzzService;
import com.devaneios.fizzbuzzfizzbuzz.services.FizzService;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

@RestController
@RequestMapping("numbers/fizz")
@AllArgsConstructor
public class FizzController {

    private final FizzService fizzService;

    @GetMapping
    public ResponseEntity<ArrayList<Integer>> getAllFizzNumbers(){
        return ResponseEntity.ok(this.fizzService.getAllFizzNumbers());
    }
}
