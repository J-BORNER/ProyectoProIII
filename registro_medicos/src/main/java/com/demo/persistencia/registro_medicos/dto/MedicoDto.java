package com.demo.persistencia.registro_medicos.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class MedicoDto {


    private String colegiado;
    private String nombreMedico;
    private String correo;
    private Integer telefono;
    private String especialidad;
    private String direccion;
    private Integer edad;
    private String fechaRegistro;
    private String observacion;

}
