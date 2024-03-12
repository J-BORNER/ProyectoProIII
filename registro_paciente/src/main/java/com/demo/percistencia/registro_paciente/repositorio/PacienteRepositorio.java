package com.demo.percistencia.registro_paciente.repositorio;

import org.springframework.data.repository.CrudRepository;

import com.demo.percistencia.registro_paciente.entidades.Pacientes;

public interface PacienteRepositorio extends CrudRepository<Pacientes, Long> {

}
