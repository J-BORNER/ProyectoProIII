package com.demo.persistencia.demopersistencia.dto;

import java.time.LocalDate;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class FormacionproDto {

    private String titulo;
    private String institucion;
    private LocalDate fechaInicio;
    private LocalDate fechaFin;

}
