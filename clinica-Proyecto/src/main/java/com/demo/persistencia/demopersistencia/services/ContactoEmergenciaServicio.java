package com.demo.persistencia.demopersistencia.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.demo.persistencia.demopersistencia.entidades.ContactosEmergencia;
import com.demo.persistencia.demopersistencia.repositorio.ContactoEmergenciaRepositorio;

@Service
public class ContactoEmergenciaServicio {

    @Autowired
    private ContactoEmergenciaRepositorio contactoEmergenciaRepositorio;

    public List<ContactosEmergencia> consultaContactosEmergencia(){
        return (List<ContactosEmergencia>) contactoEmergenciaRepositorio.findAll();
    }

    public ContactosEmergencia registContactosEmergencia(ContactosEmergencia contactosEmergencia){
        return contactoEmergenciaRepositorio.save(contactosEmergencia);
    }

}
