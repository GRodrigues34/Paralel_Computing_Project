package br.com.pcproject.PCP.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import lombok.*;
import java.util.*;
import java.io.*;


@Entity
@Getter
@Setter
public class Livro {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "book_name", length = 100)
    private String name;

    @Column(name = "book_author", length = 100)
    private String author;

    @Column(name = "book_image")
    private byte[] image;

    @Column(name = "book_price")
    private Float price;

    @Column(name = "book_quantity")
    private Integer quantity;

    @ManyToMany(mappedBy = "carrinho", fetch = FetchType.LAZY)
    private List<User> users = new ArrayList<>();


}
