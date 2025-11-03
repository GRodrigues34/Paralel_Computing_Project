package br.com.pcproject.PCP.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import br.com.pcproject.PCP.model.User;
import br.com.pcproject.PCP.DTO.UserDTO;
import br.com.pcproject.PCP.repository.UserRepository;
import br.com.pcproject.PCP.model.Livro;
import br.com.pcproject.PCP.mapper.UserMapper;


@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;
    @Autowired
    private UserMapper userMapper;

    public User addUser(User user){
       return userRepository.save(user);
    }

    public boolean deleteUser(int id){
        if(userRepository.existsById(id)){
            userRepository.deleteById(id);
            return true;
        }
        return false;
    }

    public User updateUser(int id, User user){
        if(userRepository.existsById(id)){
            user.setId(id);
            return userRepository.save(user);
        }
        return null;
    }

    public User saveUserByDTO(UserDTO userDTO){
        return addUser(userMapper.toUser(userDTO));
    }

    public void addToCart (Livro livro, User user){
        try{
            user.getCarrinho().add(livro);
        } catch(Exception e){
            System.out.println("Livro não adicionado a o carrinho: " + e.getMessage());
        }
    }

    public void addToObtained(Livro livro, User user){
        try{
            user.getLivrosObtidos().add(livro);
        } catch(Exception e){
            System.out.println("Livro não adicionado a coleção: " + e.getMessage());
        }
    }


}
