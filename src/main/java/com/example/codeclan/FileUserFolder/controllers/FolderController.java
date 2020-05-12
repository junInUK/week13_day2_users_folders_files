package com.example.codeclan.FileUserFolder.controllers;

import com.example.codeclan.FileUserFolder.models.Folder;
import com.example.codeclan.FileUserFolder.repositories.FolderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/folders")
public class FolderController {

    @Autowired
    FolderRepository folderRepository;

    @GetMapping
    public List<Folder> getAllFolders(){
        return folderRepository.findAll();
    }

    @GetMapping(value = "/folders/{id}")
    public ResponseEntity getFolder(@PathVariable Long id){
        return new ResponseEntity<>(folderRepository.findById(id), HttpStatus.OK);
    }
}
