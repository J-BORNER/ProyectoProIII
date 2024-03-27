package com.demo.persistencia.demopersistencia.entidades;

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
@Table(name = "prescripcion")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Prescripciones {

    @Id
    @Column(name = "id_prescripcion")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idPrescripcion;

    @ManyToOne
    @JoinColumn(name = "id_historial")
    private HistorialMedico historialMedico;

    private String medicamento;
    private String dosis;
    private String duracion;

}
