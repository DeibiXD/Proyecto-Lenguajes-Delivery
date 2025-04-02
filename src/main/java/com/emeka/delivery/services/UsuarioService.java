package com.emeka.delivery.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.emeka.delivery.dtos.UsuarioDto;
import com.emeka.delivery.models.Direccion;
import com.emeka.delivery.models.Estado;
import com.emeka.delivery.models.Usuario;
import com.emeka.delivery.repositories.DireccionRepository;
import com.emeka.delivery.repositories.EstadoRepository;
import com.emeka.delivery.repositories.UsuarioRepository;

@Service
public class UsuarioService {
    
    @Autowired
    UsuarioRepository usuarioRepository;

    @Autowired
    EstadoRepository estadoRepository;

    @Autowired
    DireccionRepository direccionRepository;

    public String signin(UsuarioDto userDto) {
        Usuario existe = usuarioRepository.findById(userDto.getIdUsuario()).get();
        if(existe == null){
            Usuario user = new Usuario();
            user.setNombre(userDto.getNombre());
            user.setApellido(userDto.getApellido());
            user.setCorreo(userDto.getCorreo());
            user.setContrasenia(userDto.getContrasenia());
            user.setDni(userDto.getDni());
            user.setEstado(estadoInicial());   //Por defecto es "Disponible"
            user.setUbicacionRepartidor(getUbicacionSesion(userDto)); //dudo si está bien hecho...
            usuarioRepository.save(user);
            user.getUbicacionRepartidor().setUsuario(user);
            return "Usuario creado";
        }
        return "El usuario ya existe.";
    }

    private Estado estadoInicial() {
        Estado estado = new Estado();
        estado.setEstado("Disponible");
        estadoRepository.save(estado);
        return estado;
    }

    //No estoy seguro si está bien así...
    private Direccion getUbicacionSesion(UsuarioDto user) {
        Direccion dir = new Direccion();
        dir.setDireccion(user.getUbicacionRepartidor().getDireccion());
        dir.setUbicacion(user.getUbicacionRepartidor().getUbicacion());
        direccionRepository.save(dir);
        return dir;
    }

    //Modificar para que pueda recibir el rol del usuario
    public Usuario login(String correo, String contrasenia) throws NullPointerException{
        Usuario existe = usuarioRepository.findByCorreo(correo);
        if(existe != null && existe.getContrasenia() == contrasenia){
            return existe;  //El front-end envia la pantallaCliente
        }
        throw new NullPointerException();   //El front-end atrapa la excepcion y devuelve la misma página con un mensaje rojo "El correo o contraseña es incorrecto."
    }



    //TODO: Métodos usuario Cliente

    //TODO: Métodos usuario Admin
}
