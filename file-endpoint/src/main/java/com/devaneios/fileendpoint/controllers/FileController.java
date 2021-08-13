package com.devaneios.fileendpoint.controllers;

import org.springframework.http.ResponseEntity;
import org.springframework.util.StreamUtils;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Paths;

@RestController
@RequestMapping("/file")
public class FileController {

    @PostMapping
    public ResponseEntity<Boolean> uploadFile(InputStream file) throws IOException {
        OutputStream outStream = Files.newOutputStream(Paths.get("C:/Users/natan.lisboa/Desktop/targetfile.txt"));
        StreamUtils.copy(file, outStream);
        return ResponseEntity.ok(true);
    }

}
