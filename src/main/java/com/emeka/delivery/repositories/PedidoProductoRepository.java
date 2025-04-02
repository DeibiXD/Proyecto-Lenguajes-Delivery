package com.emeka.delivery.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.emeka.delivery.models.PedidoProducto;
import com.emeka.delivery.models.PedidoProductoId;

//¿Estará bien definido con el @EmbeddedId?
@Repository
public interface PedidoProductoRepository extends CrudRepository<PedidoProducto, PedidoProductoId>{
    
}
