package com.demo.persistencia.demopersistencia.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.demo.persistencia.demopersistencia.entidades.HistorialMedico;
import com.demo.persistencia.demopersistencia.repositorio.HistorialMedicoRepositorio;

@Service
public class HistorialMedicoServicio {

    @Autowired
    private HistorialMedicoRepositorio historialMedicoRepositorio;

    /**
     * @return
     */
    public List<HistorialMedico> cosnsultarHistorialMedico(){
        return(List<HistorialMedico>) historialMedicoRepositorio.findAll();
    }

    /**
     * @param historialMedico
     * @return
     */
    @SuppressWarnings("null")
    public HistorialMedico registHistorialMedico(HistorialMedico historialMedico){
        return historialMedicoRepositorio.save(historialMedico);
    }
}
