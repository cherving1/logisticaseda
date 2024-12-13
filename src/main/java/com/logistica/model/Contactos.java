package com.logistica.model;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
@Table(name = "contactos")
public class Contactos {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(length = 25) // Permitir que sea NULL
    private String telefono;

    @ManyToOne
    @JoinColumn(name = "ruc", nullable = false) // Relación con Distribuidores
    private Distribuidores distribuidor;
}
