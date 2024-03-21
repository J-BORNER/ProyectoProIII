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
@Table(name = "pacientes")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Pacientes {


    @Id
    @Column(name = "id_paciente")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idPaciente;

    @Column(name = "id_usuario")
    private Integer idUsuario;

    @Column(name = "nombre_paciente")
    private String nombrePaciente;

    @Column(name = "direccion_paciente")
    private String direccionPaciente;

    @Column(name = "telefono_paciente")
    private Integer telefonoPaciente;

    @Column(name = "id_contacto_emergencia")
    private Integer idContactoemerg;

    @Column(name = "fecha_registro_p")
    private LocalDate fechaRegistrop;

    @Column(name = "fecha_nacimiento")
    private LocalDate fechaNacimiento;

    private String genero;
    
    @Column(name = "id_seguro")
    private Integer idSeguro;
    
}
