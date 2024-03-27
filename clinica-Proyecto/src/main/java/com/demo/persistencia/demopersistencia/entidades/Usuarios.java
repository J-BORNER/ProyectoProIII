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
@Table(name = "usuarios")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Usuarios {

    @Id
    @Column(name = "id_usuario")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idUsuario;

    private String nombre;

    @Column(name = "correo_electronico")
    private String correoElectronico;

    @Column(name = "fecha_registro")
    private LocalDate fechaRegistro;

    // conocido como relacion inversa
    @OneToMany(mappedBy = "usuarios") // mappedBy o traducido como mapeado por ""
    private List<Doctores> doctores;
    
    // conocido como relacion inversa
    @OneToMany(mappedBy = "usuarios")// mappedBy o traducido como mapeado por ""
    private List<Pacientes> pacientes;

}
