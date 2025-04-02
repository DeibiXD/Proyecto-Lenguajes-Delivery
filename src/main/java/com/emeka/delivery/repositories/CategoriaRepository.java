package com.emeka.delivery.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.emeka.delivery.models.Categoria;

@Repository
public interface CategoriaRepository extends CrudRepository<Categoria, Integer>{
    
}
