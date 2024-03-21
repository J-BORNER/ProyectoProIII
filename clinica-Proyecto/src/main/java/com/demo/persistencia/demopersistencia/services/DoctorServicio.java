package com.demo.persistencia.demopersistencia.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.demo.persistencia.demopersistencia.entidades.Doctores;
import com.demo.persistencia.demopersistencia.repositorio.DoctorRepositorio;

@Service
public class DoctorServicio {

    @Autowired
    private DoctorRepositorio doctorRepositorio;

    /**
     * @return
     */
    public List<Doctores> consultaDoctores(){
        return (List<Doctores>) doctorRepositorio.findAll();
    }

    /**
     * @param doctore
     * @return
     */
    @SuppressWarnings("null")
    public Doctores regiDoctores(Doctores doctore){
        return doctorRepositorio.save(doctore);
    }

}
