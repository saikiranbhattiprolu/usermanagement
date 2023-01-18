package com.pk.usermanagement.domain;

import com.fasterxml.jackson.annotation.JsonTypeId;

import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Table
public class User {
    @Id
    private Long userId;

    private String name;

    private Role role;

}
