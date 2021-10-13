package com.sab.noumanagerv2.dao;

import com.sab.noumanagerv2.entities.Country;

import org.springframework.data.jpa.repository.JpaRepository;

public interface CountryRepo extends JpaRepository<Country, Long> {

}
