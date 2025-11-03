package br.com.pcproject.PCP.mapper;

import  br.com.pcproject.PCP.model.*;

import br.com.pcproject.PCP.DTO.LivroDTO;
import br.com.pcproject.PCP.model.Livro;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class LivroMapper {

    public Livro toLivro(LivroDTO livroDTO){
        Livro livro = new Livro();

        livro.setName(livroDTO.getName());
        livro.setId(livroDTO.getId());
        livro.setAuthor(livroDTO.getAuthor());
        livro.setPrice(livro.getPrice());
        livro.setQuantity(livro.getQuantity());
        livro.setImage(livro.getImage());

        return livro;
    }
}
