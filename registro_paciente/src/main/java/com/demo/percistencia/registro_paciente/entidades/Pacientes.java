package com.demo.percistencia.registro_paciente.entidades;

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
@Table(name = "paciente")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Pacientes {


    @Id
    @Column(name = "id_paciente")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idPaciente;

    @Column(name = "nombre_paciente")
    private String nombrePaciente;

    private String direccion;
    
    @Column(name = "fecha_nacimiento")
    private String fechaNacimiento;

    private Integer telefono;
    private String correo;
    private Integer edad;
    


}
