package com.demo.persistencia.demopersistencia.repositorio;

import org.springframework.data.repository.CrudRepository;

import com.demo.persistencia.demopersistencia.entidades.Citas;

public interface CitaRepositorio extends CrudRepository <Citas, Long> {

}
