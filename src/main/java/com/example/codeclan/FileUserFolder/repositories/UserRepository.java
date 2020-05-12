package com.example.codeclan.FileUserFolder.repositories;

import com.example.codeclan.FileUserFolder.models.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
