package com.example.codeclan.FileUserFolder.repositories;

import com.example.codeclan.FileUserFolder.models.File;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FileRepository extends JpaRepository<File, Long> {
}
