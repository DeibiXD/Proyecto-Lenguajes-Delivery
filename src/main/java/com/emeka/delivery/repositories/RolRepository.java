package com.emeka.delivery.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.emeka.delivery.models.Rol;

@Repository
public interface RolRepository extends CrudRepository<Rol, Integer>{
    
}
