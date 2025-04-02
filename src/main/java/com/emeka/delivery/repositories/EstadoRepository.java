package com.emeka.delivery.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.emeka.delivery.models.Estado;

@Repository
public interface EstadoRepository extends CrudRepository<Estado, Integer>{
    
}
