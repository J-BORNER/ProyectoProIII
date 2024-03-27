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
@Table(name = "doctores")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Doctores {

    @Id
    @Column(name = "id_doctor")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idDoctor;

    @ManyToOne // FK la intervencion de la clase usuarios para los doctores
    @JoinColumn(name = "id_usuario")
    private Usuarios usuarios;

    private String colegiado;
    
    @Column(name = "nombre_doctor")
    private String nombreDoctor;

    @ManyToOne // FK de la misam manera que la anterior, intervencion con la tabla epecializaciones.
    @JoinColumn(name = "especializacion_id")
    private Especializacion especializacion;

    @Column(name = "fecha_registro")
    private LocalDate fechaRegistro;

    private String direccion;

    private Integer edad;

    @ManyToOne // FK
    @JoinColumn(name = "id_educacion")
    private FormacionProfecional formacionProfecional;

    @ManyToOne // FK
    @JoinColumn(name = "id_experiencia_lab")
    private RegistroLaboral registroLaboral;

    private String observacion;

    //conocida como relacion inversa
    @OneToMany(mappedBy = "doctores") //mappedBy es una ralcion unidireccional y se puedde traducir como "mapeado por"
    private List<Citas> citas;

    

}
