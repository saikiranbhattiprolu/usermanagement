package com.pk.usermanagement.repository;

import com.pk.usermanagement.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserManagementRepository extends JpaRepository<User,Long> {
}
