package com.devaneios.fizzbuzzfizzbuzz.controllers;

import com.devaneios.fizzbuzzfizzbuzz.services.BuzzService;
import com.devaneios.fizzbuzzfizzbuzz.services.FizzBuzzService;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

@RestController
@RequestMapping("numbers/buzz")
@AllArgsConstructor
public class BuzzController {

    private final BuzzService buzzService;

    @GetMapping
    public ResponseEntity<ArrayList<Integer>> getAllBuzzNumbers(){
        return ResponseEntity.ok(this.buzzService.getAllBuzzNumbers());
    }

}
