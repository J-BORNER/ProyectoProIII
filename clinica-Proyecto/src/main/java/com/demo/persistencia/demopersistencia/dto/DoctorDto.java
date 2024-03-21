package com.demo.persistencia.demopersistencia.dto;

import java.time.LocalDate;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class DoctorDto {

    private Integer idUsuario;
    private String colegiado;
    private String nombreDoctor;
    private Integer especializacionId;
    private LocalDate fechaRegistro;
    private String direccion;
    private Integer edad;
    private Integer idEducacion;
    private Integer idExperiencialab;
    private String observacion;

}
