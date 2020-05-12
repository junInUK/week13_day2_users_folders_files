package com.example.codeclan.FileUserFolder.repositories;

import com.example.codeclan.FileUserFolder.models.Folder;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FolderRepository extends JpaRepository<Folder,Long> {
}
