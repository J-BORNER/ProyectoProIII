package com.demo.persistencia.demopersistencia.repositorio;

import org.springframework.data.repository.CrudRepository;

import com.demo.persistencia.demopersistencia.entidades.Usuarios;

public interface UsuariosRepositorio extends CrudRepository<Usuarios, Long> {

}
