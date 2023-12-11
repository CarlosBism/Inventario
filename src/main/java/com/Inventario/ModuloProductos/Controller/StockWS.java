package com.Inventario.ModuloProductos.Controller;

import com.Inventario.ModuloProductos.Model.Stock;
import com.Inventario.ModuloProductos.Service.stockImpServicio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("StockWS")
@CrossOrigin
public class StockWS {
    @Autowired
    stockImpServicio stockImpServicio;



    //Listar
//    http://localhost:8080/StockWS/listar
    @GetMapping("listar")
    public List<Stock> listar(){
        return stockImpServicio.listar();
    }

    //Guardar
//    http://localhost:8080/StockWS/guardar
    @PostMapping("guardar")
    public void guardar(@RequestBody Stock stock) {stockImpServicio.guardar(stock);
    }

// Editar

    // http://localhost:8080/StockWS/editar
    @PostMapping("editar")
    public void editar(@RequestBody Stock stock) {
        stockImpServicio.editar(stock);
    }

// Eliminar

// http://localhost:8080/StockWS/eliminar

    @PostMapping("eliminar")
    public void eliminar(@RequestBody Stock stock) {

        stockImpServicio.eliminar(stock);
    }

// Buscar

//// http://localhost:9000/StockWS/buscar
    @PostMapping("buscar")
    public Stock buscar(@RequestBody Stock stock) {
        return stockImpServicio.buscar(stock);

    }

}
