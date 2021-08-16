package com.sab.noumanagerv2.dao;

import java.util.List;

import com.sab.noumanagerv2.entities.Country;
import com.sab.noumanagerv2.entities.Event;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EventRepo extends JpaRepository<Event, Long> {

    List<Event> findByCountry(Country th);

}