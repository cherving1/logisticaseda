package com.logistica.model;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
@Table(name = "observaciones")
public class Observaciones {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false) // Cambio para permitir texto de longitud arbitraria
    private String observacion;

    @ManyToOne
    @JoinColumn(name = "ruc", nullable = false) // Relación con Distribuidores
    private Distribuidores distribuidor;
}
