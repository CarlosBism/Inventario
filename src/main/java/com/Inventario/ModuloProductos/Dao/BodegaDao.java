package com.Inventario.ModuloProductos.Dao;

import com.Inventario.ModuloProductos.Model.Bodega;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BodegaDao extends JpaRepository<Bodega,Integer> {
}
