package com.logistica.service;

import com.logistica.model.Distribuidores;
import com.logistica.repo.DistribuidoresRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DistribuidoresService {

    @Autowired
    private DistribuidoresRepo distribuidoresRepo;

    public List<Distribuidores> obtenerTodos() {
        return distribuidoresRepo.findAll();
    }

    public Distribuidores guardarDistribuidor(Distribuidores distribuidor) {
        return distribuidoresRepo.save(distribuidor);
    }

    public Distribuidores obtenerPorRUC(String ruc) {
        return distribuidoresRepo.findByRuc(ruc);
    }

    public void eliminarDistribuidor(String ruc) {
        Distribuidores distribuidor = distribuidoresRepo.findByRuc(ruc);
        if (distribuidor != null) {
            distribuidoresRepo.delete(distribuidor);
        }
    }
}
