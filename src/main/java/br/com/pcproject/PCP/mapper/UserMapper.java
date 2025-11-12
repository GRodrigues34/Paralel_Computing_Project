package br.com.pcproject.PCP.mapper;


import org.springframework.stereotype.Component;
import br.com.pcproject.PCP.DTO.UserDTO;
import br.com.pcproject.PCP.model.User;
import br.com.pcproject.PCP.model.Livro;


@Component
public class UserMapper {

    public User toUser(UserDTO userDTO){
        User user = new User();

        user.setName(userDTO.getName());
        user.setEmail(userDTO.getEmail());
        user.setPassword(userDTO.getPassword());

        for(Livro livro: userDTO.getCarrinho()){
           user.getCarrinho().add(livro);
        }
        return user;

    /*    for(Livro livro: user.getLivrosObtidos()){
            user.getLivrosObtidos().add(livro);
        }
        return user;
     */

    }


}
