package com.pk.usermanagement.domain;

import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;
import java.util.Collection;

@Table
public class RolePermissions {
    @Id
    Integer id;

    @ManyToMany
    private Collection<Permissions> permissions;






}
