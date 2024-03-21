package com.demo.persistencia.demopersistencia.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.demo.persistencia.demopersistencia.dto.PacienteDto;
import com.demo.persistencia.demopersistencia.entidades.Pacientes;
import com.demo.persistencia.demopersistencia.services.PacienteServicio;

@RestController
@RequestMapping("/api")
public class PacienteController {

    @Autowired
    private PacienteServicio servicioPaciente;

    @GetMapping("/listarPacientes")
    public List<Pacientes> consultarPacientes(){
        return servicioPaciente.consultarPacientes();
    }

    @PostMapping("/registrarPaciente")
    public Pacientes registrarPaciente(@RequestBody PacienteDto pacienteJson){

        Pacientes paciente = new Pacientes();

        paciente.setIdUsuario(pacienteJson.getIdUsuario());
        paciente.setNombrePaciente(pacienteJson.getNombrePaciente());
        paciente.setDireccionPaciente(pacienteJson.getDireccionPaciente());
        paciente.setTelefonoPaciente(pacienteJson.getTelefonoPaceinte());
        paciente.setIdContactoemerg(pacienteJson.getIdContactoemerg());
        paciente.setFechaRegistrop(pacienteJson.getFechaRegistrop());
        paciente.setFechaNacimiento(pacienteJson.getFechaNacimiento());
        paciente.setGenero(pacienteJson.getGenero());
        paciente.setIdSeguro(pacienteJson.getIdSeguro());

        return servicioPaciente.registPacientes(paciente);

    }
}
