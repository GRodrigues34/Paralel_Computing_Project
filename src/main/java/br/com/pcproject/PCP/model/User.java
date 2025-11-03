package br.com.pcproject.PCP.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import lombok.*;
import java.util.*;
import java.io.*;
import br.com.pcproject.PCP.model.Livro;

@Entity
@Getter
@Setter
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column
    private String name;

    @Column
    private String email;

    @Column
    private String password;

    @ManyToMany(mappedBy = "carrinho")
    private List<Livro> carrinho = new ArrayList<>();

    @ManyToMany(mappedBy = "LivrosObtidos")
    private List<Livro> livrosObtidos = new ArrayList<>();
}
