package com.devaneios.manytomanyrelationship.controllers;

import com.devaneios.manytomanyrelationship.dto.ChampionshipDto;
import com.devaneios.manytomanyrelationship.services.ChampionshipService;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/championship")
@AllArgsConstructor
public class ChampionshipController {

    private final ChampionshipService championshipService;

    @PostMapping
    public ResponseEntity<?> createChampionship(@RequestBody ChampionshipDto championshipDto){
        this.championshipService.createChampionship(championshipDto);
        return new ResponseEntity<>(HttpStatus.CREATED);
    }

    @PostMapping("/{championshipId}/club/{clubId}")
    public ResponseEntity<?> registerClubIntoChampionship(@PathVariable Long clubId, @PathVariable Long championshipId){
        this.championshipService.registerClubIntoChampionship(clubId, championshipId);
        return new ResponseEntity<>(HttpStatus.CREATED);
    }

}
