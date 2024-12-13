package com.logistica.model;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
@Table(name = "distribuidores_rubros")
public class DistribuidoresRubros {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "ruc", nullable = false) // Relación con Distribuidores
    private Distribuidores distribuidor;

    @ManyToOne
    @JoinColumn(name = "id_rubro", nullable = false) // Relación con Rubros
    private Rubros rubro;
}
