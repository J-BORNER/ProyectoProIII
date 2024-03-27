package com.demo.persistencia.demopersistencia.repositorio;

import org.springframework.data.repository.CrudRepository;

import com.demo.persistencia.demopersistencia.entidades.Prescripciones;

public interface PrescripcionRepositorio extends CrudRepository <Prescripciones, Long> {

}
