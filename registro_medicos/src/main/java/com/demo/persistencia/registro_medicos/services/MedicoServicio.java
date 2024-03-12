package com.demo.persistencia.registro_medicos.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.demo.persistencia.registro_medicos.entidades.Medicos;
import com.demo.persistencia.registro_medicos.repositorio.MedicoRepositorio;

@Service
public class MedicoServicio {

    @Autowired
    private MedicoRepositorio medicoRepositorio;


    /**
     * @return
     */
    public List<Medicos> consultaMedicos(){
        return(List<Medicos>) medicoRepositorio.findAll();
    }


    /**
     * @param medico
     * @return
     */
    @SuppressWarnings("null")
    public Medicos registMedicos(Medicos medico){
        return medicoRepositorio.save(medico);
    }

}
