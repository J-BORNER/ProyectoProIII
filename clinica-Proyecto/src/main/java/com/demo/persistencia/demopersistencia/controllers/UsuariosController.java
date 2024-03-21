package com.demo.persistencia.demopersistencia.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.demo.persistencia.demopersistencia.dto.UsuariosDto;
import com.demo.persistencia.demopersistencia.entidades.Usuarios;
import com.demo.persistencia.demopersistencia.services.UsuariosServicio;

@RestController
@RequestMapping("/api")
public class UsuariosController {

    @Autowired
    private UsuariosServicio servicioUsuario;

    @GetMapping("/listarUsuarios")
    public List<Usuarios> consultarUsuarios(){
        return servicioUsuario.consultarUsuarios();
    }

    @PostMapping("/registrarUsuario")
    public Usuarios registrarUsuario(@RequestBody UsuariosDto usuarioJson){

        Usuarios usuario = new Usuarios();

        usuario.setNombre(usuarioJson.getNombre());
        usuario.setCorreoElectronico(usuarioJson.getCorreoElectronico());
        usuario.setFechaRegistro(usuarioJson.getFechaRegistro());

        return servicioUsuario.registUsuarios(usuario);
    }

}
