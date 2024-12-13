package com.logistica.repo;

import com.logistica.model.Distribuidores;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DistribuidoresRepo extends JpaRepository<Distribuidores, String> {
    Distribuidores findByRuc(String ruc);
}
