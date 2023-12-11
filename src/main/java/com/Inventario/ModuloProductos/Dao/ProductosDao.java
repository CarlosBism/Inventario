package com.Inventario.ModuloProductos.Dao;

import com.Inventario.ModuloProductos.Model.Producto;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductosDao extends JpaRepository<Producto,Integer> {
}
