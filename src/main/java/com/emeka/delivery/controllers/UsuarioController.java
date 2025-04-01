package com.emeka.delivery.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.emeka.delivery.services.UsuarioService;

import org.springframework.beans.factory.annotation.Autowired;

@RestController
@RequestMapping("/app")     
public class UsuarioController {
    
    @Autowired
    UsuarioService usuarioService;
    
    //TODO: Métodos usuario Cliente

    //TODO: Métodos usuario Admin
}
