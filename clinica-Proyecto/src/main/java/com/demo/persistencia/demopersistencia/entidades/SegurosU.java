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
@Table(name = "seguros")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class SegurosU {

    @Id
    @Column(name = "id_seguro")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idSeguro;

    @Column(name = "nombre_empresa")
    private String nombreEmpresa;

    @Column(name = "numero_poliza")
    private String numeroPoliza;

    @Column(name = "tipo_seguro")
    private String tipoSeguro;

    //conocida como relacion inversa
    @OneToMany(mappedBy = "segurosU") //mappedBy es una ralcion unidireccional y se puedde traducir como "mapeado por"
    private List<Pacientes> pacientes;
    

}
