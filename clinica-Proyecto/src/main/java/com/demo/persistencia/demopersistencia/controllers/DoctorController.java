package com.demo.persistencia.demopersistencia.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.demo.persistencia.demopersistencia.dto.DoctorDto;
import com.demo.persistencia.demopersistencia.entidades.Doctores;
import com.demo.persistencia.demopersistencia.services.DoctorServicio;

@RestController
@RequestMapping("/api")
public class DoctorController {

    @Autowired
    private DoctorServicio servicioDoctor;

    @GetMapping("/listarDoctores")
    public List<Doctores> consultarDoctores(){
        return servicioDoctor.consultaDoctores();
    }

    @PostMapping("/registrarDoctor")
    public Doctores registrarDoctor(@RequestBody DoctorDto doctorJson){

        Doctores doctor = new Doctores();

        doctor.setIdUsuario(doctorJson.getIdUsuario());
        doctor.setColegiado(doctorJson.getColegiado());
        doctor.setNombreDoctor(doctorJson.getNombreDoctor());
        doctor.setEspecializacionId(doctorJson.getEspecializacionId());
        doctor.setFechaRegistro(doctorJson.getFechaRegistro());
        doctor.setDireccion(doctorJson.getDireccion());
        doctor.setEdad(doctorJson.getEdad());
        doctor.setIdEducacion(doctorJson.getIdEducacion());
        doctor.setIdExperiencialab(doctorJson.getIdExperiencialab());
        doctor.setObservacion(doctorJson.getObservacion());

        return servicioDoctor.regiDoctores(doctor);
        
    }
}
