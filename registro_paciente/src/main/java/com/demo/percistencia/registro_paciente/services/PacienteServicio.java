package com.demo.percistencia.registro_paciente.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.demo.percistencia.registro_paciente.entidades.Pacientes;
import com.demo.percistencia.registro_paciente.repositorio.PacienteRepositorio;

@Service
public class PacienteServicio {

    @Autowired
    private PacienteRepositorio pacienteRepositorio;


    /**
     * @return
     */
    public List<Pacientes> conusltarPacientes(){
        return (List<Pacientes>) pacienteRepositorio.findAll();
    }

    
    /**
     * @param paciente
     * @return
     */
    @SuppressWarnings("null")
    public Pacientes registPacientes(Pacientes paciente){
        return pacienteRepositorio.save(paciente);
    }
}
