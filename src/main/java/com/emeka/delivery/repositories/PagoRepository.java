package com.emeka.delivery.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.emeka.delivery.models.Pago;

@Repository
public interface PagoRepository extends CrudRepository<Pago, Integer>{
    
}
