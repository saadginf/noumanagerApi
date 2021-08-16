package com.sab.noumanagerv2.service;

import java.util.List;

import com.sab.noumanagerv2.dao.CountryRepo;
import com.sab.noumanagerv2.entities.Country;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CountryServiceImpl implements CountryService {
    @Autowired
    CountryRepo cRepo;

    @Override
    public Country addLieux(Country c) {
        // TODO Auto-generated method stub
        return cRepo.save(c);
    }

    @Override
    public Country getById(Long id) {
        // TODO Auto-generated method stub
        return cRepo.findById(id).get();
    }

    @Override
    public List<Country> getAllCountries() {
        // TODO Auto-generated method stub
        return cRepo.findAll();
    }

}
