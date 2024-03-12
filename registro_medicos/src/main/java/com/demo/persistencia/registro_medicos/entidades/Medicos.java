package com.demo.persistencia.registro_medicos.entidades;


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
@Table(name = "medico")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Medicos {


    @Id
    @Column(name = "id_medico")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idMendico;

    private String colegiado;

    @Column(name = "nombre_medico")
    private String nombreMedico;

    private String correo;
    private Integer telefono;
    private String especialidad;
    private String direccion;
    private Integer edad;

    @Column(name = "fecha_registro")
    private String fechaRegistro;

    private String observacion;
    

}
