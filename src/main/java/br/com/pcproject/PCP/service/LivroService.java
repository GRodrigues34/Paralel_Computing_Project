package br.com.pcproject.PCP.service;


import br.com.pcproject.PCP.DTO.LivroDTO;
import br.com.pcproject.PCP.repository.LivroRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import br.com.pcproject.PCP.service.LivroService;
import java.util.List;
import java.util.Optional;
import br.com.pcproject.PCP.model.Livro;
import br.com.pcproject.PCP.mapper.LivroMapper;


@Service
public class LivroService {

    @Autowired
    private LivroRepository livroRepository;
    @Autowired
    private LivroMapper livroMapper;

    public Livro saveLivro(Livro livro){
        return livroRepository.save(livro);
    }

    public Livro livroUpdate(int id, Livro livro){
        if(livroRepository.existsById(id)){
            livro.setId(id);
            return livroRepository.save(livro);
        }
        return null;
    }

    public boolean deleteLivro(int id){
        if(livroRepository.existsById(id)){
            livroRepository.deleteById(id);
            return true;
        }
        return false;
    }

    public Livro saveLivroByDTO(LivroDTO livroDTO){
        return saveLivro(livroMapper.toLivro(livroDTO));
    }

}
