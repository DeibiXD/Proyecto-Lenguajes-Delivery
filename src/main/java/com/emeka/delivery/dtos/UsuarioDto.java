package com.emeka.delivery.dtos;

import com.emeka.delivery.models.Direccion;
import com.emeka.delivery.models.Estado;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class UsuarioDto {
    private int idUsuario;
    private String nombre;
    private String apellido;
    private String correo;
    private String contrasenia;
    private String dni;
    private Estado estado;
    private Direccion ubicacionRepartidor;
}
