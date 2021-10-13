package com.sab.noumanagerv2.dao;

import com.sab.noumanagerv2.entities.AppUser;

import org.springframework.data.jpa.repository.JpaRepository;

public interface AppUserRepo extends JpaRepository<AppUser, Long> {
    AppUser findByUsername(String username);
}