package com.Inventario.ModuloProductos.Service;

import com.Inventario.ModuloProductos.Model.Bodega;
import com.Inventario.ModuloProductos.Model.Producto;
import com.Inventario.ModuloProductos.Model.Stock;

import java.util.List;

public interface stockServicio {


    public void guardar (Stock stock);
    public void editar (Stock stock);
    public void eliminar (Stock stock);
    //    Devuelve un objeto de tipo bodega
    public Stock buscar (Stock stock);

    public List<Stock> listar();
}
