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
@Table(name = "pacientes")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Pacientes {


    @Id
    @Column(name = "id_paciente")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idPaciente;

    @ManyToOne// FK la intervencion de la clase usuarios para los pacientes
    @JoinColumn(name = "id_usuario")
    private Usuarios usuarios;

    @Column(name = "nombre_paciente")
    private String nombrePaciente;

    @Column(name = "direccion_paciente")
    private String direccionPaciente;

    @Column(name = "telefono_paciente")
    private Integer telefonoPaciente;

    @ManyToOne // FK
    @JoinColumn(name = "id_contacto_emergencia")
    private ContactosEmergencia contactosEmergencia;

    @Column(name = "fecha_registro_p")
    private LocalDate fechaRegistrop;

    @Column(name = "fecha_nacimiento")
    private LocalDate fechaNacimiento;

    private String genero;
    
    @ManyToOne // FK
    @JoinColumn(name = "id_seguro")
    private SegurosU segurosU;

    // conocido como relacion inversa
    @OneToMany(mappedBy = "pacientes") // mappedBy o traducido como mapeado por ""
    private List<Citas> citas;

    // conocido como relacion inversa
    @OneToMany(mappedBy = "pacientes") // mappedBy o traducido como mapeado por ""
    private List<HistorialMedico> historialMedicos;
    
}
