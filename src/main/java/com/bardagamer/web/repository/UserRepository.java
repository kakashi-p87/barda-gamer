package com.bardagamer.web.repository;

import com.bardagamer.web.model.User;
import org.springframework.stereotype.Repository;

@Repository
public class UserRepository {

    public User getUser(){
        User user = new User();
        user.setUserName("kakashi");

        return user;
    }
}
