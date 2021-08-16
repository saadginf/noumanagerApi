package com.sab.noumanagerv2.service;

import java.util.List;

import com.sab.noumanagerv2.entities.AppRole;
import com.sab.noumanagerv2.entities.AppUser;

public interface AccountService {
    AppUser addNewUser(AppUser aU);

    AppUser addNewAdmin();

    AppRole addNewRole(AppRole aR);

    void addRoleToUser(String username, String roleName);

    AppUser loadUserByUsername(String username);

    AppRole loadRoleByName(String username);

    List<AppUser> listUers();
}