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
@Table(name = "doctores")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Doctores {

    @Id
    @Column(name = "id_doctor")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idDoctor;

    @Column(name = "id_usuario")
    private Integer idUsuario;

    private String colegiado;
    
    @Column(name = "nombre_doctor")
    private String nombreDoctor;

    @Column(name = "especializacion_id")
    private Integer especializacionId;

    @Column(name = "fecha_registro")
    private LocalDate fechaRegistro;

    private String direccion;

    private Integer edad;

    @Column(name = "id_educacion")
    private Integer idEducacion;

    @Column(name = "id_experiencia_lab")
    private Integer idExperiencialab;

    private String observacion;
    

}
