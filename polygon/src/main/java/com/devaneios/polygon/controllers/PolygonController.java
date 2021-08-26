package com.devaneios.polygon.controllers;

import com.devaneios.polygon.dto.PolygonDto;
import com.devaneios.polygon.services.PolygonService;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/polygon")
@AllArgsConstructor
public class PolygonController {

    private final PolygonService polygonService;

    @PostMapping
    public ResponseEntity<?> registerPolygon(@RequestBody PolygonDto polygonDto){
        this.polygonService.registerPolygon(polygonDto);
        return new ResponseEntity<>(HttpStatus.CREATED);
    }

}
