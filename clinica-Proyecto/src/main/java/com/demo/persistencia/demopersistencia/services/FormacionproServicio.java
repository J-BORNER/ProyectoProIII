package com.demo.persistencia.demopersistencia.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.demo.persistencia.demopersistencia.entidades.FormacionProfecional;
import com.demo.persistencia.demopersistencia.repositorio.FormacionproRepositorio;

@Service
public class FormacionproServicio {

    @Autowired
    private FormacionproRepositorio formacionproRepositorio;

    /**
     * @return
     */
    public List<FormacionProfecional> consultarFormacionpro(){
        return (List<FormacionProfecional>) formacionproRepositorio.findAll();
    }

    /**
     * @param formacionProfecional
     * @return
     */
    @SuppressWarnings("null")
    public FormacionProfecional registFormacionProfecional(FormacionProfecional formacionProfecional){
        return formacionproRepositorio.save(formacionProfecional);
    }

}
