package com.emeka.delivery.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.emeka.delivery.models.Pedido;

@Repository
public interface PedidoRepository extends CrudRepository<Pedido, Integer>{
    
}
