package com.logistica.controller;

import com.logistica.model.Distribuidores;
import com.logistica.service.DistribuidoresService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/distribuidores")
public class DistribuidoresController {

    @Autowired
    private DistribuidoresService distribuidoresService;

    // Obtener todos los distribuidores
    @GetMapping
    public List<Distribuidores> obtenerTodos() {
        return distribuidoresService.obtenerTodos();
    }

    // Guardar un distribuidor
    @PostMapping
    public Distribuidores guardarDistribuidor(@RequestBody Distribuidores distribuidor) {
        return distribuidoresService.guardarDistribuidor(distribuidor);
    }

    // Buscar un distribuidor por RUC
    @GetMapping("/{ruc}")
    public Distribuidores obtenerPorRUC(@PathVariable String ruc) {
        return distribuidoresService.obtenerPorRUC(ruc);
    }

    // Eliminar un distribuidor
    @DeleteMapping("/{ruc}")
    public void eliminarDistribuidor(@PathVariable String ruc) {
        distribuidoresService.eliminarDistribuidor(ruc);
    }

}
