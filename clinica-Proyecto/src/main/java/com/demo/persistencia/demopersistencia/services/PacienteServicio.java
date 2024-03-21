package com.demo.persistencia.demopersistencia.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.demo.persistencia.demopersistencia.entidades.Pacientes;
import com.demo.persistencia.demopersistencia.repositorio.PacienteRepositorio;

@Service
public class PacienteServicio {

    @Autowired
    private PacienteRepositorio pacienteRepositorio;

    /**
     * @return
     */
    public List<Pacientes> consultarPacientes(){
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
