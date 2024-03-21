package com.demo.persistencia.demopersistencia.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.demo.persistencia.demopersistencia.dto.SegurosDto;
import com.demo.persistencia.demopersistencia.entidades.SegurosU;
import com.demo.persistencia.demopersistencia.services.SegurosServicio;

@RestController
@RequestMapping("/api")
public class SegurosController {


    @Autowired
    private SegurosServicio servicioSeguros;

    @GetMapping("/listarSeguros")
    public List<SegurosU> consultarSegurosU(){
        return servicioSeguros.consultarSegurosU();
    }

    @PostMapping("/registrarSeguro")
    public SegurosU registraSeguro(@RequestBody SegurosDto segurosJson){
        
        SegurosU segurosU = new SegurosU();

        segurosU.setNombreEmpresa(segurosJson.getNombreEmpresa());
        segurosU.setNumeroPoliza(segurosJson.getNumeroPoliza());
        segurosU.setTipoSeguro(segurosJson.getTipoSeguro());

        return servicioSeguros.registSegurosU(segurosU);

        
    }
}
