package com.emeka.delivery.dtos;

import java.time.LocalDateTime;
import java.util.Set;

import com.emeka.delivery.models.Empresa;
import com.emeka.delivery.models.Estado;
import com.emeka.delivery.models.Pago;
import com.emeka.delivery.models.Producto;
import com.emeka.delivery.models.Usuario;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class PedidoDto {
    private int idPedido;
    private LocalDateTime fechaPedido;
    private LocalDateTime fechaFinal;
    private double costoEnvioTotal;
    private double montoTotalDeProductos;
    private Usuario comprador;
    private Usuario repartidor;
    private Estado estado;
    private Pago pago;
    private Empresa empresa;
    private Set<Producto> productos;
}
