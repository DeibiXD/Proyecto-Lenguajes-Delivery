package com.emeka.delivery.dtos;

import com.emeka.delivery.models.Usuario;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class EmpresaDto {
    private int idEmpresa;

    private String empresa;

    private String RTN;

    private double costoEnvio;

    private Usuario administradorEmpresa;
}
