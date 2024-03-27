package com.demo.persistencia.demopersistencia.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class PrescripcionDto {

    private Integer idHistorial;
    private String medicamento;
    private String dosis;
    private String duracion;

}
