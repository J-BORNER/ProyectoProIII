package com.demo.persistencia.demopersistencia.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.demo.persistencia.demopersistencia.dto.HitorialMedicoDto;
import com.demo.persistencia.demopersistencia.entidades.HistorialMedico;
import com.demo.persistencia.demopersistencia.services.HistorialMedicoServicio;

@RestController
@RequestMapping("/api")
public class HistorialMedicoController {

    @Autowired
    private HistorialMedicoServicio servicioHistorialMedico;

    @GetMapping("/listarHistoriales")
    public List<HistorialMedico> cosnsultarHistorialMedico(){
        return servicioHistorialMedico.cosnsultarHistorialMedico();
    }

    @PostMapping("/registrarHistoral")
    public HistorialMedico registarHistorialMedico(@RequestBody HitorialMedicoDto historialMedicoJson){
        
        HistorialMedico historialMedico = new HistorialMedico();

       
        historialMedico.setFechaConsulta(historialMedicoJson.getFechaConsulta());
        historialMedico.setDiagnostico(historialMedicoJson.getDiagnostico());

        return servicioHistorialMedico.registHistorialMedico(historialMedico);
        

    }

}
