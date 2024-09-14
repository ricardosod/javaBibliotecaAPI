package com.libraries.SpringBook.service;


import com.libraries.SpringBook.dto.UserRequestCreate;
import com.libraries.SpringBook.dto.UserRequestUpDate;
import com.libraries.SpringBook.dto.UserResponse;
import com.libraries.SpringBook.entities.User;
import com.libraries.SpringBook.exception.UserException;
import com.libraries.SpringBook.mapper.UserMapper;
import com.libraries.SpringBook.repository.UserRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Slf4j
@Service
public class UserService {

@Autowired
private UserRepository userRepository;

@Autowired
private UserMapper userMapper;

//TODO retornar diretamente user
public  Iterable<User> findAll(){
    Iterable<User> user =  userRepository.findAll();
    return user;
}

@Transactional
public UserResponse saveUser(UserRequestCreate userRequest){
var user = userMapper.toUser(userRequest);
user = userRepository.save(user);
return userMapper.toUserResponse(user);

}


public UserResponse updateUser(Long id, UserRequestUpDate userRequestUpDate){
    var user = userRepository.findById(id).orElseThrow(UserException::new);
    var userResponse = userRepository.save(userMapper.toUserUpDate(userRequestUpDate, user));
    return userMapper.toUserResponse(userResponse);


}
//TODO métodos devem ser iniciados com letras minúsculas
    public UserResponse FindById(Long id){
      var user = userRepository.findById(id)
              .orElseThrow(() -> new UserException(String.format("Usuário não encontrado com id: %s", id)));

       return userMapper.toUserResponse(user);

    }

    public void deleteUser(Long id){

        boolean exists = userRepository.existsById(id);
        if(!exists){
            throw  new UserException("Id não encontrado");
        }
        userRepository.deleteById(id);
    }
}
