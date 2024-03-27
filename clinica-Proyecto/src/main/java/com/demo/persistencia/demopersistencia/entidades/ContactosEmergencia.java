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
@Table(name = "contactos_emergencia")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class ContactosEmergencia {

    @Id
    @Column(name = "id_contacto_emergencia")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idContacEmergencia;

    private String nombre;
    private String telefono;
    private String relacion;
    
    //conocida como relacion inversa
    @OneToMany(mappedBy = "contactosEmergencia")//mappedBy es una ralcion unidireccional y se puedde traducir como "mapeado por"
    private List<Pacientes> pacientes;

}
