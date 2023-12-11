package com.Inventario.ModuloProductos.Controller;


import com.Inventario.ModuloProductos.Model.Bodega;
import com.Inventario.ModuloProductos.Service.bodegaImpServicio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("BodegaWS")
@CrossOrigin
public class BodegaWS {
    @Autowired
    bodegaImpServicio bodegaImpServicio;

    //Listar
//    http://localhost:8080/BodegaWS/listar
    @GetMapping("listar")
    public List<Bodega> listar(){
        return bodegaImpServicio.listar();
    }

    //Guardar
//    http://localhost:8080/BodegaWS/guardar
    @PostMapping("guardar")
    public void guardar(@RequestBody Bodega bodega) {
        bodegaImpServicio.guardar(bodega);
    }

// Editar

// http://localhost:9000/DesarrolladoresWS/editar

    @PostMapping("editar")
    public void editar(@RequestBody Bodega bodega) {
        bodegaImpServicio.guardar(bodega);
    }

// Eliminar

// http://localhost:9000/DesarrolladoresWS/eliminar

    @PostMapping("eliminar")
    public void eliminar(@RequestBody Bodega bodega) {
        bodegaImpServicio.eliminar(bodega);
    }

// Buscar

//// http://localhost:9000/DesarrolladoresWS/buscar

    @PostMapping("buscar")
    public Bodega buscar(@RequestBody Bodega bodega) {
        return bodegaImpServicio.buscar(bodega);
    }

}
