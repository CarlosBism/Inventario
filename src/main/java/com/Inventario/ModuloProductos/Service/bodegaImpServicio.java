package com.Inventario.ModuloProductos.Service;

import com.Inventario.ModuloProductos.Dao.BodegaDao;
import com.Inventario.ModuloProductos.Model.Bodega;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class bodegaImpServicio implements bodegaServicio {

//    Inyeccion de Dao, implementar metodos sin necesidad de instanciar la clase
    @Autowired
    BodegaDao bodegaDao;

    @Transactional
    @Override
    public void guardar(Bodega bodega) {
        bodegaDao.save(bodega);

    }

    @Transactional
    @Override
    public void editar(Bodega bodega) {
        bodegaDao.save(bodega);

    }

    @Transactional
    @Override
    public void eliminar(Bodega bodega) {
        bodegaDao.delete(bodega);

    }

    @org.springframework.transaction.annotation.Transactional(readOnly = true)
    @Override
    public Bodega buscar(Bodega bodega) {
        return bodegaDao.findById(bodega.getBodegaId()).orElse(null);
    }


    @org.springframework.transaction.annotation.Transactional(readOnly = true)
    @Override
    public List<Bodega> listar() {
        return bodegaDao.findAll();
    }
}
