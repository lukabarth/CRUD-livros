package com.example.springboot.dtos;

import jakarta.validation.constraints.NotBlank;

public record BookRecordDto(@NotBlank String title, @NotBlank String author, String publishedDate) {
}
