package com.devaneios.polygon.controllers;

import com.devaneios.polygon.services.PolygonSideService;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/polygon-side")
@AllArgsConstructor
public class PolygonSideController {

    private final PolygonSideService polygonSideService;

    @PostMapping("/{length}/polygon/{polygonId}")
    public ResponseEntity<?> registerPolygonSide(@PathVariable double length, @PathVariable Long polygonId){
        this.polygonSideService.registerPolygonSide(length, polygonId);
        return new ResponseEntity<>(HttpStatus.CREATED);
    }

}
