package com.devaneios.manytomanyrelationship.controllers;

import com.devaneios.manytomanyrelationship.dto.ClubDto;
import com.devaneios.manytomanyrelationship.services.ClubService;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/club")
@AllArgsConstructor
public class ClubController {

    private final ClubService clubService;

    @PostMapping
    public ResponseEntity<HttpStatus> createChampionship(@RequestBody ClubDto clubDto){
        this.clubService.createClub(clubDto);
        return new ResponseEntity<>(HttpStatus.CREATED);
    }


}
