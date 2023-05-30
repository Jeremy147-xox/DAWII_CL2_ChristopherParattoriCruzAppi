package cibertec.DAWII_CL2_ChristopherParattoriCruz.model;


import lombok.Data;

import jakarta.persistence.*;

import java.math.BigDecimal;

@Data
@Entity
@Table(name = "especialidad")
public class Especialidad {
	
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idespe")
    private String idespe;

    @Column(name = "nombre")
    private String nombre;

    @Column(name = "costo")
    private BigDecimal costo;
}