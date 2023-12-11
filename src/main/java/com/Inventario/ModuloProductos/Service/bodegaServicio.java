package com.Inventario.ModuloProductos.Service;

import com.Inventario.ModuloProductos.Model.Bodega;

import java.util.List;

public interface bodegaServicio {

    public void guardar (Bodega bodega);
    public void editar (Bodega bodega);
    public void eliminar (Bodega bodega);
//    Devuelve un objeto de tipo bodega
    public Bodega buscar (Bodega bodega);

    public List<Bodega> listar();

}
