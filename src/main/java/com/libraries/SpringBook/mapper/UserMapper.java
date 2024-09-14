package com.libraries.SpringBook.mapper;

import com.libraries.SpringBook.dto.UserRequestCreate;
import com.libraries.SpringBook.dto.UserRequestUpDate;
import com.libraries.SpringBook.dto.UserResponse;
import com.libraries.SpringBook.entities.User;

import java.util.List;

public interface UserMapper {

    UserResponse toUserResponse(User user);

    User toUser(UserRequestCreate userRequest);

    User toUserUpDate(UserRequestUpDate userRequest, User user);

    List<User> toCollection(List<User> users);


}
