package com.demo.persistencia.demopersistencia.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.demo.persistencia.demopersistencia.dto.FormacionproDto;
import com.demo.persistencia.demopersistencia.entidades.FormacionProfecional;
import com.demo.persistencia.demopersistencia.services.FormacionproServicio;

@RestController
@RequestMapping("/api")
public class FormacionporController {

    @Autowired
    private FormacionproServicio servicioFormacionpro;

    @GetMapping("/listarFormaciones")
    public List<FormacionProfecional> consultarFormacionProfecional(){
        return servicioFormacionpro.consultarFormacionpro();
    }

    @PostMapping("/registrarFormacion")
    public FormacionProfecional registFormacionProfecional(@RequestBody FormacionproDto formacionproJson){

        FormacionProfecional formacionProfecional = new FormacionProfecional();

        formacionProfecional.setTitulo(formacionproJson.getTitulo());
        formacionProfecional.setInstitucion(formacionproJson.getInstitucion());
        formacionProfecional.setFechaInicio(formacionproJson.getFechaInicio());
        formacionProfecional.setFechaFin(formacionproJson.getFechaFin());

        return servicioFormacionpro.registFormacionProfecional(formacionProfecional);
    }

}
