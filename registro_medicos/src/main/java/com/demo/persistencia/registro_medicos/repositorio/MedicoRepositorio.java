package com.demo.persistencia.registro_medicos.repositorio;

import org.springframework.data.repository.CrudRepository;

import com.demo.persistencia.registro_medicos.entidades.Medicos;

public interface MedicoRepositorio extends CrudRepository<Medicos, Long> {

}
