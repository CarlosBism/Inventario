package com.Inventario.ModuloProductos.Service;

import com.Inventario.ModuloProductos.Model.Estante;

import java.util.List;

public interface estanteServicio {

    public void guardar(Estante estante);
    public void editar(Estante estante);
    public void eliminar (Estante estante);
    public Estante buscar (Estante estante);
    public List<Estante> listar ();

}
