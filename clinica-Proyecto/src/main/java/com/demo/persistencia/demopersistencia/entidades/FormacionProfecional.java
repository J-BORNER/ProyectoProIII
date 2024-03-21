package com.demo.persistencia.demopersistencia.entidades;

import java.time.LocalDate;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "formacion_profesional")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class FormacionProfecional {

    @Id
    @Column(name = "id_formacion")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idFormacion;

    private String titulo;
    private String institucion;

    @Column(name = "fecha_inicio")
    private LocalDate fechaInicio;

    @Column(name = "fecha_fin")
    private LocalDate fechaFin;

}
