package com.libraries.SpringBook.mapper;


import com.libraries.SpringBook.dto.UserRequestCreate;
import com.libraries.SpringBook.dto.UserRequestUpDate;
import com.libraries.SpringBook.dto.UserResponse;
import com.libraries.SpringBook.entities.User;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class UserMapperIMPL implements UserMapper{


    @Override
    public UserResponse toUserResponse(User user) {

        return UserResponse.builder()
                .id(user.getId())
                .name(user.getName())
                .dateBirth(user.getDateBirth())
                .email(user.getEmail())
                .address(user.getAddress())
                .build();

    }



    public User toUser(UserRequestCreate userRequest){
        return User.builder()
                .name(userRequest.getName())
                .dateBirth(userRequest.getDateBirth())
                .email(userRequest.getEmail())
                .address(userRequest.getAddress())
                .build();


    }

    public User toUserUpDate(UserRequestUpDate userRequestUpDate, User user){
     return User.builder()
              .id(userRequestUpDate.getId() == null ? user.getId(): userRequestUpDate.getId())
             .name(userRequestUpDate.getName() == null ? user.getName() : userRequestUpDate.getName())
             .dateBirth(userRequestUpDate.getDateBirth() == null ? user.getDateBirth() : userRequestUpDate.getDateBirth())
             .email(userRequestUpDate.getEmail() == null ? user.getEmail() : userRequestUpDate.getEmail())
             .address(userRequestUpDate.getAddress() == null ? user.getAddress(): userRequestUpDate.getAddress())
             .build();

    }

    @Override
    public List<User> toCollection(List<User> users) {
        return List.of();
    }


}
