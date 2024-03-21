package com.demo.persistencia.demopersistencia.repositorio;

import org.springframework.data.repository.CrudRepository;

import com.demo.persistencia.demopersistencia.entidades.HistorialMedico;

public interface HistorialMedicoRepositorio extends CrudRepository<HistorialMedico, Long> {

}
