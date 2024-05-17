package com.example.springboot.models;

import jakarta.persistence.*;

import java.io.Serializable;
import java.util.UUID;

@Entity
@Table(name = "TB_BOOKS") // Essas duas anotações pertencem a dependencia de persistência do banco de dados
public class BookModel implements Serializable {
    private static final long serialVersionUID = 1L;

    // Definindo as colunas da tabela
    @Id // Anotação para os ID
    @GeneratedValue(strategy=GenerationType.AUTO) // Anotação para definir o ID com auto incremento
    private UUID idBook;
    private String title;
    private String author;
    private String publishedDate;

    public UUID getIdBook() {
        return idBook;
    }

    public void setIdBook(UUID idBook) {
        this.idBook = idBook;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getPublishedDate() {
        return publishedDate;
    }

    public void setPublishedDate(String publishedDate) {
        this.publishedDate = publishedDate;
    }
}
