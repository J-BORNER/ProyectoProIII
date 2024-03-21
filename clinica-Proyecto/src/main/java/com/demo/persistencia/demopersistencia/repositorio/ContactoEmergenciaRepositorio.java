package com.demo.persistencia.demopersistencia.repositorio;

import org.springframework.data.repository.CrudRepository;

import com.demo.persistencia.demopersistencia.entidades.ContactosEmergencia;

public interface ContactoEmergenciaRepositorio extends CrudRepository<ContactosEmergencia, Long> {

}
