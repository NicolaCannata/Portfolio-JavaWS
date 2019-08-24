package com.nicolacannata.Appws;

import com.nicolacannata.Appws.entity.UserEntity;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

//Crud
@Repository
public interface UserRepository extends CrudRepository <UserEntity, Long> {
    UserEntity findUserByEmail(String email);
}
