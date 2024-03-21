package com.demo.persistencia.demopersistencia.repositorio;

import org.springframework.data.repository.CrudRepository;

import com.demo.persistencia.demopersistencia.entidades.Pacientes;

public interface PacienteRepositorio extends CrudRepository<Pacientes, Long> {

    
}
