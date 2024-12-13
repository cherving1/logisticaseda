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

    @Column(length = 500, nullable = false)
    private String observacion;

    @ManyToOne
    @JoinColumn(name = "ruc", nullable = false)
    private Distribuidores distribuidor;
}
