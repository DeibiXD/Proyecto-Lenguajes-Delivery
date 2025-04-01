package com.emeka.delivery.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.emeka.delivery.models.Direccion;

@Repository
public interface DireccionRepository extends CrudRepository<Direccion, Integer>{
    
}
