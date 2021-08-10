package br.devaneios.message.controllers;

import br.devaneios.message.dto.MessageDto;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/message")
public class MessageController {

    @PostMapping
    public ResponseEntity<MessageDto> printMessage(@RequestBody MessageDto message){
        System.out.println(message.toString());
        return ResponseEntity.ok(message);
    }

}
