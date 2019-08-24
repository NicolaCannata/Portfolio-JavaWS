package com.nicolacannata.Appws.service.impl;

import com.nicolacannata.Appws.entity.UserEntity;
import com.nicolacannata.Appws.service.UserService;
import com.nicolacannata.Appws.shared.dto.UserDto;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

    @Override
    public UserDto createUser(UserDto user){

        UserEntity userEntity = new UserEntity();
        return null;
    }
}
