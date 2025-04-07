package com.emeka.delivery.dtos;

import com.emeka.delivery.models.MetodoPago;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class PagoDto {
    private int idPago;
    private String factura;
    private double totalFactura;
    private MetodoPago metodoPago;
}
