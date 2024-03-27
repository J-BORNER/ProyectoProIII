package com.demo.persistencia.demopersistencia.entidades;

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
@Table(name = "especializacion")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Especializacion {

    @Id
    @Column(name = "id_especializacion")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idEspeializacion;
    
    private String nombre;
    private String descripcion;

    // conocida como relacion inversa
    @OneToMany(mappedBy = "especializacion")//  mappedBy traducido como mapeado por ""
    private List<Doctores> doctores;

}
