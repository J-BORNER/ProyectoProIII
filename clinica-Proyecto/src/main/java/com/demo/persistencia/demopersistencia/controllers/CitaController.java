package com.demo.persistencia.demopersistencia.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.demo.persistencia.demopersistencia.dto.CitaDto;
import com.demo.persistencia.demopersistencia.entidades.Citas;
import com.demo.persistencia.demopersistencia.services.CitaServicio;

@RestController
@RequestMapping("/api")
public class CitaController {

    @Autowired
    private CitaServicio servicioCita;

    @GetMapping("/listarCitas")
    public List<Citas> consultarCitas(){
        return servicioCita.consultarCitas();
    }

    @PostMapping("/registrarCita")
    public Citas registrarCita(@RequestBody CitaDto citaJson){

        Citas cita = new Citas();

       
        
        cita.setFechaCita(citaJson.getFechaCita());

        return servicioCita.registCitas(cita);
        
    }

}
