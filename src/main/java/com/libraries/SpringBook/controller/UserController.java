package com.libraries.SpringBook.controller;


import com.libraries.SpringBook.dto.UserRequestCreate;
import com.libraries.SpringBook.dto.UserRequestUpDate;
import com.libraries.SpringBook.dto.UserResponse;
import com.libraries.SpringBook.entities.User;
import com.libraries.SpringBook.service.UserService;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RequiredArgsConstructor
@RestController
@RequestMapping("/user")
public class UserController {


private  final UserService userService;


 @GetMapping
 public  Iterable<User> findAll(){
    return  userService.findAll();


 }

 @PostMapping
public ResponseEntity<UserResponse> insert(@Valid @RequestBody UserRequestCreate userRequest){
  var userResponse = userService.saveUser(userRequest);
  return  new ResponseEntity<>(userResponse, HttpStatus.CREATED);

}

@PutMapping(value = "/{id}")
public ResponseEntity<UserResponse> upDateUser(@PathVariable Long id , @RequestBody UserRequestUpDate userRequestUpDate){
var userResponse = userService.updateUser(id, userRequestUpDate);
return ResponseEntity.ok(userResponse);

}
 @GetMapping(value = "/{id}")
    public ResponseEntity<UserResponse> findById(@PathVariable Long id){
     var user = userService.FindById(id);
     return ResponseEntity.ok(user);

 }

    @DeleteMapping("/{id}")
    public ResponseEntity<User> delete(@PathVariable Long id) {
        userService.deleteUser(id);

        return ResponseEntity.noContent().build();
    }

}
