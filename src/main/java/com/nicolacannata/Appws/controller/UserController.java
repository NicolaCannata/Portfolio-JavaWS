package com.nicolacannata.Appws.controller;

import com.nicolacannata.Appws.model.request.UserRequestModel;
import com.nicolacannata.Appws.model.response.UserRest;
import com.nicolacannata.Appws.service.UserService;
import com.nicolacannata.Appws.shared.dto.UserDto;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("users")
public class UserController {

    @Autowired
    UserService userService;

    @GetMapping
    public String getUser(){
        return "Hai richiesto un user GET";
    }

    @PostMapping
    public UserRest createUser(@RequestBody UserRequestModel userDetail){

        UserRest returnValue = new UserRest();

        UserDto userDto = new UserDto();
        BeanUtils.copyProperties(userDetail, userDto);

        UserDto createdUser = userService.createUser(userDto);
        BeanUtils.copyProperties(createdUser, returnValue);

        return returnValue;
    }

    @PutMapping
    public String updateUser(){
        return "Update user PUT";
    }

    @DeleteMapping
    public  String deleteUser(){
        return "User eliminato DELETE";
    }
}
