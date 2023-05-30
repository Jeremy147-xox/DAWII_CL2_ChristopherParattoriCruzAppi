package cibertec.DAWII_CL2_ChristopherParattoriCruz.model;

import lombok.Data;

import jakarta.persistence.*;



@Data
@Entity
@Table(name = "alumno")
public class Alumno {
	
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private String id;

    @Column(name = "apealumno")
    private String apealumno;

    @Column(name = "nomalumno")
    private String nomalumno;

    @ManyToOne
    @JoinColumn(name = "idespe")
    private Especialidad especialidad;

    @Column(name = "proce")
    private String proce;
}

