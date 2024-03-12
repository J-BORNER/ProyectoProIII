package com.demo.persistencia.registro_medicos.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.demo.persistencia.registro_medicos.dto.MedicoDto;
import com.demo.persistencia.registro_medicos.entidades.Medicos;
import com.demo.persistencia.registro_medicos.services.MedicoServicio;

@RestController
@RequestMapping("/api")
public class MedicoController {

    @Autowired
    private MedicoServicio servicioMedico;

    @GetMapping("/listarMedicos")
    public List<Medicos> consultarMedicos(){
        return servicioMedico.consultaMedicos();
    }

    @PostMapping("/registrarMedico")
    public Medicos registraMedico(@RequestBody MedicoDto medicoJson){

        Medicos medico = new Medicos();

        medico.setColegiado(medicoJson.getColegiado());
        medico.setNombreMedico(medicoJson.getNombreMedico());
        medico.setCorreo(medicoJson.getCorreo());
        medico.setTelefono(medicoJson.getTelefono());
        medico.setEspecialidad(medicoJson.getEspecialidad());
        medico.setDireccion(medicoJson.getDireccion());
        medico.setEdad(medicoJson.getEdad());
        medico.setFechaRegistro(medicoJson.getFechaRegistro());
        medico.setObservacion(medicoJson.getObservacion());
        
        return servicioMedico.registMedicos(medico);

    }
}
