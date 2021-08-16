
package com.sab.noumanagerv2.dao;

import com.sab.noumanagerv2.entities.CatOperation;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.stereotype.Repository;

@Repository
@RepositoryRestResource
public interface CatDepenseDao extends JpaRepository<CatOperation, Long> {

}