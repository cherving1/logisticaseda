package com.logistica.model;

import jakarta.persistence.*;
import lombok.Data;
import java.util.List;

@Entity
@Data
@Table(name = "rubros")
public class Rubros {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idRubro;

    @Column(nullable = false, length = 255, unique = true) // Restricción para evitar nombres duplicados
    private String nombreRubro;

    @OneToMany(mappedBy = "rubro", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<DistribuidoresRubros> distribuidoresRubros;
}
