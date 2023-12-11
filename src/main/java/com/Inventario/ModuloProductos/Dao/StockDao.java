package com.Inventario.ModuloProductos.Dao;

import com.Inventario.ModuloProductos.Model.Stock;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StockDao extends JpaRepository<Stock,Integer> {
//  Si deseas Agregar una busqueda por atributo se hace aqui
}
