package com.emeka.delivery.dtos;

import com.emeka.delivery.models.Empresa;
import com.emeka.delivery.models.Usuario;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class DireccionDto {
    private int idDireccion;
    
    private String direccion;

    private org.locationtech.jts.geom.Point ubicacion;

    private Usuario usuario;

    private Empresa empresa;
}
