package com.demo.persistencia.demopersistencia.entidades;

import java.time.LocalDate;
import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "registro_laboral")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class RegistroLaboral {

    @Id
    @Column(name ="id_registrolab" )
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long IdRegistrolab;

    private String puesto;
    private String institucion;

    @Column(name = "fecha_inicio")
    private LocalDate fechaInicio;

    @Column(name = "fecha_fin")
    private LocalDate fechaFin;

    // conocido como relacion inversa
    @OneToMany(mappedBy = "registroLaboral") // mappedBy o traducido como mapeado por ""
    private List<Doctores> doctores;

}
