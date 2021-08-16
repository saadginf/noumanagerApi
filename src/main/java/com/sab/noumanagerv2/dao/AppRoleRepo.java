package com.sab.noumanagerv2.dao;

import com.sab.noumanagerv2.entities.AppRole;

import org.springframework.data.jpa.repository.JpaRepository;

public interface AppRoleRepo extends JpaRepository<AppRole, Long> {
    AppRole findByRoleName(String roleName);
}