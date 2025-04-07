package com.emeka.delivery.dtos;

import java.util.Set;

import com.emeka.delivery.models.Categoria;
import com.emeka.delivery.models.Empresa;
import com.emeka.delivery.models.Pedido;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class ProductoDto {
    private int idProducto;

    private String producto;

    private String descripcion;

    private double precio;
    
    private String imagen;

    private Categoria categoria;

    private Empresa empresa;

    private Set<Pedido> pedidos;
}
