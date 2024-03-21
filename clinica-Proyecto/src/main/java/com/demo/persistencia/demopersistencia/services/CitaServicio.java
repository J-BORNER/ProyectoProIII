package com.demo.persistencia.demopersistencia.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.demo.persistencia.demopersistencia.entidades.Citas;
import com.demo.persistencia.demopersistencia.repositorio.CitaRepositorio;

@Service
public class CitaServicio {

    @Autowired
    private CitaRepositorio citaRepositorio;

    /**
     * @return
     */
    public List<Citas> consultarCitas(){
        return (List<Citas>) citaRepositorio.findAll();
    }

    /**
     * @param cita
     * @return
     */
    @SuppressWarnings("nul")
    public Citas registCitas(Citas cita){
        return citaRepositorio.save(cita);
    }

}
