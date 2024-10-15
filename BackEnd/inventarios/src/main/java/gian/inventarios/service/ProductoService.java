package gian.inventarios.service;

import gian.inventarios.model.Producto;
import gian.inventarios.repositories.ProductoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductoService implements IProductoService{

    @Autowired
    private ProductoRepository productoRepository;

    @Override
    public List<Producto> listarProductos() {
        return productoRepository.findAll();
    }

    @Override
    public Producto findByIdProducto(Integer idProducto) {
        return productoRepository.findById(idProducto).orElse(null);
    }

    @Override
    public Producto saveProducto(Producto producto) {
        return productoRepository.save(producto);
    }

    @Override
    public void deleteProducto(Integer idProducto) {
        productoRepository.deleteById(idProducto);
    }
}
