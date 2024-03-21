package com.demo.persistencia.demopersistencia.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.demo.persistencia.demopersistencia.entidades.Especializacion;
import com.demo.persistencia.demopersistencia.repositorio.EspecializacionRepositorio;

@Service
public class EspecializacionServicio {

    @Autowired
    private EspecializacionRepositorio especializacionRepositorio;

    /**
     * @return
     */
    public List<Especializacion> consultarEspecializacion(){
        return (List<Especializacion>) especializacionRepositorio.findAll();
    }

    /**
     * @param especializacion
     * @return
     */
    @SuppressWarnings("null")
    public Especializacion registEspecializacion(Especializacion especializacion){
        return especializacionRepositorio.save(especializacion);
    }

}
