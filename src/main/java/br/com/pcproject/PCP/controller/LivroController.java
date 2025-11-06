package br.com.pcproject.PCP.controller;

import java.util.List;

import br.com.pcproject.PCP.model.Livro;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LivroController {
    public List<Livro> listar;
}
