package com.emeka.delivery.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.emeka.delivery.models.Producto;

@Repository
public interface ProductoRepository extends CrudRepository<Producto, Integer>{
    
}
