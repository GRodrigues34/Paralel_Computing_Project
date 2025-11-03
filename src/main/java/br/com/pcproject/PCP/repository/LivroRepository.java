package br.com.pcproject.PCP.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import br.com.pcproject.PCP.model.Livro;

@Repository
public interface LivroRepository extends JpaRepository<Livro, Integer> {
}
