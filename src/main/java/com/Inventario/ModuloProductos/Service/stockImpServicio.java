package com.Inventario.ModuloProductos.Service;

import com.Inventario.ModuloProductos.Dao.StockDao;
import com.Inventario.ModuloProductos.Model.Stock;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class stockImpServicio implements stockServicio{

    @Autowired
    StockDao stockDao;
    @Override
    public void guardar(Stock stock) {
        stockDao.save(stock);

    }

    @Override
    public void editar(Stock stock) {
        stockDao.save(stock);

    }

    @Override
    public void eliminar(Stock stock) {
        stockDao.delete(stock);

    }

    @Override
    public Stock buscar(Stock stock) {
        return stockDao.findById(stock.getStockId()).orElse(null);
    }

    @Override
    public List<Stock> listar() {
        return stockDao.findAll();
    }
}
