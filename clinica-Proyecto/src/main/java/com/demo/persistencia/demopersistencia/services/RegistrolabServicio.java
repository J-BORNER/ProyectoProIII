package com.demo.persistencia.demopersistencia.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.demo.persistencia.demopersistencia.entidades.RegistroLaboral;
import com.demo.persistencia.demopersistencia.repositorio.RegistrolabRepositorio;

@Service
public class RegistrolabServicio {

    @Autowired
    private RegistrolabRepositorio registrolabRepositorio;

    /**
     * @return
     */
    public List<RegistroLaboral> consultarRegitroLaboral(){
        return (List<RegistroLaboral>) registrolabRepositorio.findAll();
    }

    /**
     * @param registroLaboral
     * @return
     */
    @SuppressWarnings("null")
    public RegistroLaboral registRegistroLaboral(RegistroLaboral registroLaboral){
        return registrolabRepositorio.save(registroLaboral);
    }
}
