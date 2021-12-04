package com.sab.noumanagerv2.dao;

import java.util.Date;
import java.util.List;

import com.sab.noumanagerv2.entities.Operation;

import org.springframework.data.jpa.repository.JpaRepository;

public interface OpsRepo extends JpaRepository<Operation, Long> {
    List<Operation> findByDateBetween(Date date1, Date date2);
}
