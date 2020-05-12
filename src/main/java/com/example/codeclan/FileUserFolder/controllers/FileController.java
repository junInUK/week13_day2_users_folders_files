package com.example.codeclan.FileUserFolder.controllers;

import com.example.codeclan.FileUserFolder.models.File;
import com.example.codeclan.FileUserFolder.repositories.FileRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/files")
public class FileController {
    @Autowired
    FileRepository fileRepository;

    @GetMapping
    public List<File> getAllFiles(){
        return fileRepository.findAll();
    }
}
