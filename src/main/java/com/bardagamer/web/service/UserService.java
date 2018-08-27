package com.bardagamer.web.service;

import com.bardagamer.web.model.User;
import com.bardagamer.web.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    @Autowired
    UserRepository repository;
    public User getUser(){
        return repository.getUser();
    }

}
