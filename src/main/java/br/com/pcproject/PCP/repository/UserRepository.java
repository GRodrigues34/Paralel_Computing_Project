package br.com.pcproject.PCP.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import br.com.pcproject.PCP.model.User;


@Repository
public interface UserRepository extends JpaRepository<User, Integer> {
}
