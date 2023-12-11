package com.Inventario.ModuloProductos.Controller;

import com.Inventario.ModuloProductos.Model.Estante;
import com.Inventario.ModuloProductos.Service.estanteImpServicio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("EstanteWS")
@CrossOrigin
public class EstanteWS {
    @Autowired
    estanteImpServicio estanteImpServicio;

    //Listar
//    http://localhost:8080/EstanteWS/listar
    @GetMapping("listar")
    public List<Estante> listar(){
        return estanteImpServicio.listar();
    }

    //Guardar
//    http://localhost:8080/EstanteWS/guardar
    @PostMapping("guardar")
    public void guardar(@RequestBody Estante estante) {
        estanteImpServicio.guardar(estante);
    }

// Editar

// http://localhost:8080/EstanteWS/editar

    @PostMapping("editar")
    public void editar(@RequestBody Estante estante) {
        estanteImpServicio.guardar(estante);
    }

// Eliminar

// http://localhost:8080/EstanteWS/eliminar

    @PostMapping("eliminar")
    public void eliminar(@RequestBody Estante estante) {
        estanteImpServicio.eliminar(estante);
    }

// Buscar

//// http://localhost:8080/EstanteWS/buscar

    @PostMapping("buscar")
    public Estante buscar(@RequestBody Estante estante) {
        return estanteImpServicio.buscar(estante);
    }


}
