package com.demo.percistencia.registro_paciente.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.demo.percistencia.registro_paciente.dto.PacienteDto;
import com.demo.percistencia.registro_paciente.entidades.Pacientes;
import com.demo.percistencia.registro_paciente.services.PacienteServicio;

@RestController
@RequestMapping("/api")
public class PacienteController {

    @Autowired
    private PacienteServicio servicioPaciente;

    @GetMapping("/listarPacientes")
    public List<Pacientes> consultarPacientes(){
        return servicioPaciente.conusltarPacientes();
    }

    @PostMapping("/registrarPaciente")
    public Pacientes registrarPaciente(@RequestBody PacienteDto pacienteJson){
        
        Pacientes paciente = new Pacientes();

        paciente.setDireccion(pacienteJson.getDireccion());
        paciente.setEdad(pacienteJson.getEdad());
        paciente.setNombrePaciente(pacienteJson.getNombrePaciente());
        paciente.setCorreo(pacienteJson.getCorreo());
        paciente.setFechaNacimiento(pacienteJson.getFechaNacimiento());
        paciente.setTelefono(pacienteJson.getTelefono());

        return servicioPaciente.registPacientes(paciente);

    }

}
