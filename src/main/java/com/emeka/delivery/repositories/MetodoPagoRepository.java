package com.emeka.delivery.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.emeka.delivery.models.MetodoPago;

@Repository
public interface MetodoPagoRepository extends CrudRepository<MetodoPago, Integer>{
    
}
