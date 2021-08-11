package com.devaneios.queryparametersobject.controllers;

import com.devaneios.queryparametersobject.dto.QueryParamObjectDto;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/object")
public class QueryParamObjectController {

    @GetMapping
    public ResponseEntity<QueryParamObjectDto> createQueryParamObject (@RequestParam String text) {
        QueryParamObjectDto objectDto = new QueryParamObjectDto(text);
        return ResponseEntity.ok(objectDto);
    }

}
