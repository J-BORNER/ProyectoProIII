package com.demo.persistencia.demopersistencia.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.demo.persistencia.demopersistencia.dto.RegistrolabDto;
import com.demo.persistencia.demopersistencia.entidades.RegistroLaboral;
import com.demo.persistencia.demopersistencia.services.RegistrolabServicio;

@RestController
@RequestMapping("/api")
public class RegistrolabController {

    @Autowired
    private RegistrolabServicio servicioRegistrolab;

    @GetMapping("/listarRegistros")
    public List<RegistroLaboral> consultarRegistroLaboral(){
        return servicioRegistrolab.consultarRegitroLaboral();
    }

    @PostMapping("/registrarRegistro")
    public RegistroLaboral registrarRegistroLaboral(@RequestBody RegistrolabDto registrolabJson){

        RegistroLaboral registroLaboral = new RegistroLaboral();

        registroLaboral.setPuesto(registrolabJson.getPuesto());
        registroLaboral.setInstitucion(registrolabJson.getInstitucion());
        registroLaboral.setFechaInicio(registrolabJson.getFechaInicio());
        registroLaboral.setFechaFin(registrolabJson.getFechaFin());

        return servicioRegistrolab.registRegistroLaboral(registroLaboral);
    }
}
