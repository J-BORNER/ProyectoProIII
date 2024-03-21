package com.demo.persistencia.demopersistencia.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.demo.persistencia.demopersistencia.dto.ContactoEmergenciaDto;
import com.demo.persistencia.demopersistencia.entidades.ContactosEmergencia;
import com.demo.persistencia.demopersistencia.services.ContactoEmergenciaServicio;

@RestController
@RequestMapping("/api")
public class ContactoEmergenciaController {

    @Autowired
    private ContactoEmergenciaServicio servicioContactoEmergencia;

    @GetMapping("/listarContactosEmerg")
    public List<ContactosEmergencia> consultaContactosEmergencia(){
        return servicioContactoEmergencia.consultaContactosEmergencia();
    }

    @PostMapping("/registrarContacEmergencia")
    public ContactosEmergencia registrarContactosEmergencia(@RequestBody ContactoEmergenciaDto contactoEmergenciaJson){

        ContactosEmergencia contactosEmergencia = new ContactosEmergencia();

        contactosEmergencia.setNombre(contactoEmergenciaJson.getNombre());
        contactosEmergencia.setTelefono(contactoEmergenciaJson.getTelefono());
        contactosEmergencia.setRelacion(contactoEmergenciaJson.getRelacion());

        return servicioContactoEmergencia.registContactosEmergencia(contactosEmergencia);
        

    }


}
