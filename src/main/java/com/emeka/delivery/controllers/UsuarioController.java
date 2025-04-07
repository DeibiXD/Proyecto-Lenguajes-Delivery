package com.emeka.delivery.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.emeka.delivery.dtos.UsuarioDto;
import com.emeka.delivery.models.Usuario;
import com.emeka.delivery.services.UsuarioService;

import org.springframework.beans.factory.annotation.Autowired;

@RestController
@RequestMapping("/app")     
public class UsuarioController {
    
    @Autowired
    UsuarioService usuarioService;
 
    @PostMapping("/signin")
    public String signIn(@RequestBody UsuarioDto userDto/**Todos los datos del usuario */){
        return usuarioService.signin(userDto);
    } 
    
    //Modificar para que pueda recibir y mandar el rol del usuario.
    @GetMapping("/login")
    public Usuario logIn(@RequestParam String correo, @RequestParam String contrasenia){
        return usuarioService.login(correo, contrasenia);
    }

    
    //TODO: Métodos usuario Cliente

    //TODO: Métodos usuario Admin
}
