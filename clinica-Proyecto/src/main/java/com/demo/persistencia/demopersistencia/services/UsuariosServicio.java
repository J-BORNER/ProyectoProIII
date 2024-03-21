package com.demo.persistencia.demopersistencia.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.demo.persistencia.demopersistencia.entidades.Usuarios;
import com.demo.persistencia.demopersistencia.repositorio.UsuariosRepositorio;

@Service
public class UsuariosServicio {

    @Autowired
    private UsuariosRepositorio usuariosRepositorio;


    /**
     * consultar el usuario
     * @return
     */
    public List<Usuarios> consultarUsuarios(){
        return (List<Usuarios>) usuariosRepositorio.findAll();
    }

    /**
     * @param usuario
     * @return
     */
    @SuppressWarnings("null")
    public Usuarios registUsuarios(Usuarios usuario){
        return usuariosRepositorio.save(usuario);
    }

}
