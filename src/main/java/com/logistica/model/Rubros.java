package com.logistica.model;

import jakarta.persistence.*;
import lombok.Data;
import java.util.List; // Asegúrate de importar esta clase

@Entity
@Data
@Table(name = "rubros")
public class Rubros {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idRubro;

    @Column(nullable = false, length = 255)
    private String nombreRubro;

    @OneToMany(mappedBy = "rubro", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<DistribuidoresRubros> distribuidoresRubros;
}
