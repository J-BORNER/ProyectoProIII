package com.demo.persistencia.demopersistencia.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.demo.persistencia.demopersistencia.entidades.Prescripciones;
import com.demo.persistencia.demopersistencia.repositorio.PrescripcionRepositorio;

@Service
public class PrescripcionServicio {

    @Autowired
    private PrescripcionRepositorio prescripcionRepositorio;

    /**
     * @return
     */
    public List<Prescripciones> consultarPrescripciones(){
        return (List<Prescripciones>) prescripcionRepositorio.findAll();
    }

    /**
     * @param prescripcion
     * @return
     */
    @SuppressWarnings("null")
    public Prescripciones registPrescripciones(Prescripciones prescripcion){
        return prescripcionRepositorio.save(prescripcion);
    }

}
