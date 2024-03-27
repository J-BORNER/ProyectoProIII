package com.demo.persistencia.demopersistencia.entidades;

import java.time.LocalDate;
import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "historial_medico")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class HistorialMedico {

    @Id
    @Column(name = "id_historial")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idHistorial;

    @ManyToOne
    @JoinColumn(name = "id_paciente")
    private Pacientes pacientes;

    @Column(name = "fecha_consulta")
    private LocalDate fechaConsulta;

    private String diagnostico;

    //conocida como relacion inversa
    @OneToMany(mappedBy = "historialMedico") //mappedBy es una ralcion unidireccional y se puedde traducir como "mapeado por"
    private List<Prescripciones> prescripciones;

    
}
