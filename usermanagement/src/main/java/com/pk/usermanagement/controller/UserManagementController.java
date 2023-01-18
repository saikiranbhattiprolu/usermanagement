package com.pk.usermanagement.controller;

import com.pk.usermanagement.domain.User;
import com.pk.usermanagement.domain.UserDetails;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserManagementController {

    @Autowired



    //add user
    @PostMapping("/usermanagement/add")
    public User addUser(@RequestBody UserDetails userDetails){

        return null;
    }

    //get user permissions


    //update user permissions



}
