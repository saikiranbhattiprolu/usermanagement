package com.pk.usermanagement.service.impl;

import com.pk.usermanagement.domain.User;
import com.pk.usermanagement.domain.UserDetails;
import com.pk.usermanagement.repository.UserManagementRepository;
import com.pk.usermanagement.service.UserManagementService;
import org.springframework.beans.factory.annotation.Autowired;

public class UserManagementServiceImpl implements UserManagementService {
    @Autowired
    UserManagementRepository userManagementRepository;

    @Override
    public User addUser(User userDetails){
        userManagementRepository.save(userDetails);
        return null;
    }

    @Override
    public User updateUser(User userDetails){

        return null;
    }

}
