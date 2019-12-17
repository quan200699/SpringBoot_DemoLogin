package com.codegym.user.service;

import com.codegym.user.model.Role;

public interface RoleService {
    Role findRoleByName(String roleName);
}
