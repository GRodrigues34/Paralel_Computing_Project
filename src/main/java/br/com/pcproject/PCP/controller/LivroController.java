package br.com.pcproject.PCP.controller;

import java.util.List;

import br.com.pcproject.PCP.model.Livro;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
public class LivroController {
    @ResponseBody
    @RequestMapping("/livros")
    public List<Livro> listar;
}
