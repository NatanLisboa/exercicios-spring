package br.devaneios.constructorinjection.controllers;

import br.devaneios.constructorinjection.dto.ObjectDto;
import br.devaneios.constructorinjection.model.ObjectEntity;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/object")
public class ObjectController {

    @PostMapping
    public ResponseEntity<ObjectDto> createObjectByConstructorInjection(@RequestBody ObjectEntity object){
        ObjectDto objectDto = new ObjectDto(object);
        System.out.println(objectDto.toString(object));
        return ResponseEntity.ok(objectDto);
    }

}
