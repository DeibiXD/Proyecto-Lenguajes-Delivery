package com.emeka.delivery.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.emeka.delivery.models.Lugar;

@Repository
public interface LugarRepository extends CrudRepository<Lugar, Integer>{
    
}
