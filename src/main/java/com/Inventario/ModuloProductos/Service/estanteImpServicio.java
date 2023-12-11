package com.Inventario.ModuloProductos.Service;

import com.Inventario.ModuloProductos.Dao.EstanteDao;
import com.Inventario.ModuloProductos.Model.Estante;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class estanteImpServicio implements  estanteServicio{

    @Autowired
    EstanteDao estanteDao;
    @Override
    public void guardar(Estante estante) {
        estanteDao.save(estante);

    }

    @Override
    public void editar(Estante estante) {
        estanteDao.save(estante);


    }

    @Override
    public void eliminar(Estante estante) {
        estanteDao.delete(estante);

    }

    @Override
    public Estante buscar(Estante estante) {
        return estanteDao.findById(estante.getEstanteId()).orElse(null);
    }

    @Override
    public List<Estante> listar() {
        return estanteDao.findAll();
    }
}
