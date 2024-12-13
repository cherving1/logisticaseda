package com.logistica.model;

import jakarta.persistence.*;
import lombok.Data;
import java.util.List;

@Entity
@Data
@Table(name = "distribuidores")
public class Distribuidores {

    @Id
    @Column(length = 20, nullable = false)
    private String ruc;

    @Column(nullable = false, length = 255)
    private String nombre;

    @Column(length = 250)
    private String direccion;

    @OneToMany(mappedBy = "distribuidor", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Contactos> contactos;

    @OneToMany(mappedBy = "distribuidor", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Observaciones> observaciones;

    @OneToMany(mappedBy = "distribuidor", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<DistribuidoresRubros> distribuidoresRubros;
}
