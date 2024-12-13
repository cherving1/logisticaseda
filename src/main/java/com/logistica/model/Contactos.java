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

    @Column(length = 25, nullable = false)
    private String telefono;

    @ManyToOne
    @JoinColumn(name = "ruc", nullable = false)
    private Distribuidores distribuidor;
}
