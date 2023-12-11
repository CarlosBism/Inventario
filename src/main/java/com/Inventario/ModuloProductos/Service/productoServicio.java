package com.Inventario.ModuloProductos.Service;

import com.Inventario.ModuloProductos.Model.Bodega;
import com.Inventario.ModuloProductos.Model.Producto;

import java.util.List;

public interface productoServicio{

    public void guardar (Producto producto);
    public void editar (Producto producto);
    public void eliminar (Producto producto);
    //    Devuelve un objeto de tipo bodega
    public Producto buscar (Producto producto);

    public List<Producto> listar();
}
