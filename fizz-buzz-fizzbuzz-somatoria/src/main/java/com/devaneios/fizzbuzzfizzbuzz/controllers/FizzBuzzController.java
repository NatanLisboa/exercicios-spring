package com.devaneios.fizzbuzzfizzbuzz.controllers;

import com.devaneios.fizzbuzzfizzbuzz.services.FizzBuzzService;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

@RestController
@RequestMapping("numbers/fizz-buzz")
@AllArgsConstructor
public class FizzBuzzController {

    private final FizzBuzzService fizzBuzzService;

    @GetMapping
    public ResponseEntity<ArrayList<Integer>> getAllFizzBuzzNumbers(){
        return ResponseEntity.ok(this.fizzBuzzService.getAllFizzBuzzNumbers());
    }

}
