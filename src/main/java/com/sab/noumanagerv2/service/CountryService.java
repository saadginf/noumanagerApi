package com.sab.noumanagerv2.service;

import java.util.List;

import com.sab.noumanagerv2.entities.Country;

public interface CountryService {
    public Country addLieux(Country c);

    public Country getById(Long id);

    public List<Country> getAllCountries();
}
