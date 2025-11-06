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

    @ManyToMany(fetch = FetchType.EAGER)
    @JoinTable(
            name = "usuario_carrinho_livros", // 1. Nome da nova tabela de junção
            joinColumns = @JoinColumn(name = "user_id"),      // 2. Coluna que referencia ESTA classe (User)
            inverseJoinColumns = @JoinColumn(name = "livro_id") // 3. Coluna que referencia a OUTRA classe (Livro)
    )
    private List<Livro> carrinho = new ArrayList<>();

    @ManyToMany(mappedBy = "LivrosObtidos")
    private List<Livro> livrosObtidos = new ArrayList<>();
}
