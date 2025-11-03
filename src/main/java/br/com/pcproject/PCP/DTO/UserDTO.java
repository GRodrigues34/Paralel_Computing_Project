package br.com.pcproject.PCP.DTO;

import br.com.pcproject.PCP.model.Livro;
import lombok.*;
import java.util.*;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;

@Getter
@Setter
public class UserDTO {

    @NotEmpty(message = "User name required")
    private String name;

    @NotEmpty(message = "User Email required")
    private String email;

    @NotEmpty(message = "User Password required")
    private String password;

    private List<Livro> carrinho = new ArrayList<>();

    private List<Livro> livrosObtidos = new ArrayList<>();

}
