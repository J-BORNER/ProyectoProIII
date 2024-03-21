package com.demo.persistencia.demopersistencia.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.demo.persistencia.demopersistencia.dto.EspecializacionDto;
import com.demo.persistencia.demopersistencia.entidades.Especializacion;
import com.demo.persistencia.demopersistencia.services.EspecializacionServicio;

@RestController
@RequestMapping("/api")
public class EspecializacionController {

    @Autowired
    private EspecializacionServicio servicioEspecializacion;

    @GetMapping("/listarEspecializaciones")
    public List<Especializacion> consultarEspecializacion(){
        return servicioEspecializacion.consultarEspecializacion(); 
    }

    @PostMapping("/registrarEspecializacion")
    public Especializacion resgistrarEspecializacion(@RequestBody EspecializacionDto especializacionJson){

        Especializacion especializacion = new Especializacion();

        especializacion.setNombre(especializacionJson.getNombre());
        especializacion.setDescripcion(especializacionJson.getDescripcion());

        return servicioEspecializacion.registEspecializacion(especializacion);

    }

}
