package com.demo.persistencia.demopersistencia.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.demo.persistencia.demopersistencia.dto.PrescripcionDto;
import com.demo.persistencia.demopersistencia.entidades.Prescripciones;
import com.demo.persistencia.demopersistencia.services.PrescripcionServicio;

@RestController
@RequestMapping("/api")
public class PrescripcionController {

    @Autowired
    private PrescripcionServicio servicioPrescripcion;

    @GetMapping("/listarPrescripciones")
    public List<Prescripciones> consultaPrescripciones(){
        return servicioPrescripcion.consultarPrescripciones();
    }

    @PostMapping("/registrarPrescripcion")
        public Prescripciones registraraPrescripcion(@RequestBody PrescripcionDto prescripcionJson){

            Prescripciones prescripcion = new Prescripciones();

           
            prescripcion.setMedicamento(prescripcionJson.getMedicamento());
            prescripcion.setDosis(prescripcionJson.getDosis());
            prescripcion.setDuracion(prescripcionJson.getDuracion());

            return servicioPrescripcion.registPrescripciones(prescripcion);
            
        }

}
