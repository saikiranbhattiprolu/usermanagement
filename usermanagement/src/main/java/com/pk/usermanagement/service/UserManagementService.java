package com.pk.usermanagement.service;

import com.pk.usermanagement.domain.User;
import com.pk.usermanagement.domain.UserDetails;

public interface UserManagementService {
     User addUser(User userDetails);
     User updateUser(User userDetails);
}
