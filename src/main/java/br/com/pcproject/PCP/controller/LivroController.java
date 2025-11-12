package br.com.pcproject.PCP.controller;

import java.util.List;

import br.com.pcproject.PCP.model.Livro;
import br.com.pcproject.PCP.repository.LivroRepository;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.bind.annotation.RestController;

import org.springframework.http.ResponseEntity;
import org.springframework.http.HttpStatus;

import java.util.*;

import br.com.pcproject.PCP.DTO.*;
import br.com.pcproject.PCP.model.*;
import br.com.pcproject.PCP.service.*;

@RestController
public class LivroController {

    @Autowired
    private LivroRepository livroRepository;

    @Autowired
    private LivroService livroService;


    @GetMapping("/livros")
    public ResponseEntity<ApiResponse<Object>> getAllBooks(){
        List<Livro> livros = livroService.getAllLivros();
        if(livros.isEmpty()){
            return ResponseEntity.status(HttpStatus.NOT_FOUND)
                    .body(new ApiResponse<>("error", "no books registered"));
        }
        return ResponseEntity.ok(new ApiResponse<>("success", livros));
    }

    @GetMapping("/livros/{id}")
    public ResponseEntity<ApiResponse<Object>> getBookById(@PathVariable int id){
        Optional<Livro> livro = livroService.getLivroById(id);
        if(livro.isPresent()){
            return ResponseEntity.status(HttpStatus.NOT_FOUND)
                    .body(new ApiResponse<>("error","product not found"));
        }
        return ResponseEntity.ok(new ApiResponse<>("success", livro));
    }

    @DeleteMapping("/livros/{id}")
    public ResponseEntity<ApiResponse<Object>> deleteBookById(@PathVariable int id){
        boolean deleted =livroService.deleteLivro(id);
        if(deleted){
            return ResponseEntity.noContent().build();
        } else {
            return ResponseEntity.status(HttpStatus.NOT_FOUND)
                    .body(new ApiResponse<>("error", "book not found"));
        }
    }

    @PostMapping("/Livros")
    public ResponseEntity<ApiResponse<String>> addBook(@Valid @RequestBody LivroDTO livroDTO){
        Livro createdLivro = livroService.saveLivroByDTO(livroDTO);
        return ResponseEntity.ok(new ApiResponse<>("success", "Book with id: "
                + createdLivro.getId() + "created sucecessfully"));
    }

}
