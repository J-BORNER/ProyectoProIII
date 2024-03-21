package com.demo.persistencia.demopersistencia.dto;

import java.time.LocalDate;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class PacienteDto {

    private Integer idUsuario;
    private String nombrePaciente;
    private String direccionPaciente;
    private Integer telefonoPaceinte;
    private Integer idContactoemerg;
    private LocalDate fechaRegistrop;
    private LocalDate fechaNacimiento;
    private String genero;
    private Integer idSeguro;
    

}
