package com.emeka.delivery.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.emeka.delivery.models.Empresa;

@Repository
public interface EmpresaRepository extends CrudRepository<Empresa, Integer>{
    
}
