package com.Inventario.ModuloProductos.Dao;

import com.Inventario.ModuloProductos.Model.Estante;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EstanteDao extends JpaRepository<Estante,Integer> {
//    Si deseas agregar una busqueda por otro atributo se hace aqui

}
