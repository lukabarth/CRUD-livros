package com.example.springboot.repositories;

import com.example.springboot.models.BookModel;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface BookRepository extends JpaRepository <BookModel, UUID>{
}
