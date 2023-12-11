package com.Inventario.ModuloProductos.Controller;

import com.Inventario.ModuloProductos.Model.Bodega;
import com.Inventario.ModuloProductos.Model.Producto;
import com.Inventario.ModuloProductos.Service.productoImpServicio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("ProductoWS")
@CrossOrigin
public class ProductoWS {
    @Autowired
    productoImpServicio productoImpServicio;



    //Listar
//    http://localhost:8080/ProductoWS/listar
    @GetMapping("listar")
    public List<Producto> listar(){
        return productoImpServicio.listar();
    }

    //Guardar
//    http://localhost:8080/ProductoWS/guardar
    @PostMapping("guardar")
    public void guardar(@RequestBody Producto producto) {
        productoImpServicio.guardar(producto);
    }

// Editar

// http://localhost:8080/ProductoWS/editar
    @PostMapping("editar")
    public void editar(@RequestBody Producto producto) {
        productoImpServicio.editar(producto);
    }

// Eliminar

// http://localhost:8080/ProductoWS/eliminar

    @PostMapping("eliminar")
    public void eliminar(@RequestBody Producto producto) {
        productoImpServicio.eliminar(producto);
    }

// Buscar

//// http://localhost:9000/ProductoWS/buscar

    @PostMapping("buscar")
    public Producto buscar(@RequestBody Producto producto) {
        return productoImpServicio.buscar(producto);
    }

}
