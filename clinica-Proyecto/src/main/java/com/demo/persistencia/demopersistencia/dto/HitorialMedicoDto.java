package com.demo.persistencia.demopersistencia.dto;

import java.time.LocalDate;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class HitorialMedicoDto {

    private Integer idPaciente;
    private LocalDate fechaConsulta;
    private String diagnostico;

}
