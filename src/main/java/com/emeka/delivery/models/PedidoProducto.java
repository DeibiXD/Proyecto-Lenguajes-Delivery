package com.emeka.delivery.models;
import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;

import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "pedidosproductos")
public class PedidoProducto {
    
    @EmbeddedId
    private PedidoProductoId id;

    @ManyToOne
    @JoinColumn(name = "idpedido", insertable = false, updatable = false)
    private Pedido pedido;

    @ManyToOne
    @JoinColumn(name = "idproducto", insertable = false, updatable = false)
    private Producto producto;

    private int cantidad;

}
