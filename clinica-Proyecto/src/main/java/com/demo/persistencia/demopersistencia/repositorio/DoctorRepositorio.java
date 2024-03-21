package com.demo.persistencia.demopersistencia.repositorio;

import org.springframework.data.repository.CrudRepository;

import com.demo.persistencia.demopersistencia.entidades.Doctores;

public interface DoctorRepositorio extends CrudRepository <Doctores, Long> {

}
