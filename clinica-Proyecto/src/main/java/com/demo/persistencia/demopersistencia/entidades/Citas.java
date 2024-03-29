package com.demo.persistencia.demopersistencia.entidades;

import java.time.LocalDate;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "citas")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Citas {

    @Id
    @Column(name = "id_cita")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idCitas;

    //FK
    @ManyToOne
    @JoinColumn(name = "id_doctor")
    private Doctores doctores;

    //FK
    @ManyToOne
    @JoinColumn(name = "id_paciente")
    private Pacientes pacientes;

    @Column(name = "fecha_cita")
    private LocalDate fechaCita;

}
