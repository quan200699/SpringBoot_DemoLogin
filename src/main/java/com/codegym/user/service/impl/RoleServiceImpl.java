package com.codegym.user.service.impl;

import com.codegym.user.model.Role;
import com.codegym.user.repository.RoleRepository;
import com.codegym.user.service.RoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RoleServiceImpl implements RoleService {

    @Autowired
    private RoleRepository roleRepository;

    @Override
    public Role findRoleByName(String roleName) {
        return roleRepository.findRoleByName(roleName);
    }
}
