package com.Inventario.ModuloProductos.Service;

import com.Inventario.ModuloProductos.Dao.BodegaDao;
import com.Inventario.ModuloProductos.Dao.ProductosDao;
import com.Inventario.ModuloProductos.Model.Bodega;
import com.Inventario.ModuloProductos.Model.Producto;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class productoImpServicio implements productoServicio{
    //    Inyeccion de Dao, implementar metodos sin necesidad de instanciar la clase
    @Autowired
    ProductosDao productosDao;

    @Override
    public void guardar(Producto producto) {
        productosDao.save(producto);
    }

    @Override
    public void editar(Producto producto) {
        productosDao.save(producto);
    }

    @Override
    public void eliminar(Producto producto) {
        productosDao.delete(producto);

    }

    @Override
    public Producto buscar(Producto producto) {
        return productosDao.findById(producto.getProductoId()).orElse(null);
    }

    @Override
    public List<Producto> listar() {
        return productosDao.findAll();
    }
}
