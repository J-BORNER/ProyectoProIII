package com.demo.persistencia.demopersistencia.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class SegurosDto {


    private String nombreEmpresa;
    private String numeroPoliza;
    private String tipoSeguro;

}
