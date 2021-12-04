package com.sab.noumanagerv2.dao;

import com.sab.noumanagerv2.entities.Saving;

import org.springframework.data.jpa.repository.JpaRepository;

public interface SavingRepo extends JpaRepository<Saving, Long> {
    
}
