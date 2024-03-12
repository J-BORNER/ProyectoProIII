package com.demo.percistencia.registro_paciente.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class PacienteDto {

    private String nombrePaciente;
    private String direccion;
    private String fechaNacimiento;
    private Integer telefono;
    private String correo;
    private Integer edad;

}
