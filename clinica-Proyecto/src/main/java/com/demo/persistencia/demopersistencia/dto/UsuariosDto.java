package com.demo.persistencia.demopersistencia.dto;

import java.time.LocalDate;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class UsuariosDto {

    private String nombre;
    private String correoElectronico;
    private LocalDate fechaRegistro;

}
