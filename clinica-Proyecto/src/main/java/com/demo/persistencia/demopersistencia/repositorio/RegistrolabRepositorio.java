package com.demo.persistencia.demopersistencia.repositorio;

import org.springframework.data.repository.CrudRepository;

import com.demo.persistencia.demopersistencia.entidades.RegistroLaboral;

public interface RegistrolabRepositorio extends CrudRepository<RegistroLaboral, Long> {

}
