package com.demo.persistencia.demopersistencia.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.demo.persistencia.demopersistencia.entidades.SegurosU;
import com.demo.persistencia.demopersistencia.repositorio.SegurosRepositorio;

@Service
public class SegurosServicio {

    @Autowired
    private SegurosRepositorio segurosRepositorio;

    
    /**
     * @return
     */
    public List<SegurosU> consultarSegurosU(){
        return (List<SegurosU>) segurosRepositorio.findAll();
    }

    /**
     * @param segurosU
     * @return
     */
    @SuppressWarnings("null")
    public SegurosU registSegurosU(SegurosU segurosU){
        return segurosRepositorio.save(segurosU);
    }

}
