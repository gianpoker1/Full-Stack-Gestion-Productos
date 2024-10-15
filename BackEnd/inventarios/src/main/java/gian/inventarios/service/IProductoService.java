package gian.inventarios.service;

import gian.inventarios.model.Producto;

import java.util.List;

public interface IProductoService {

    public List<Producto> listarProductos();
    public Producto findByIdProducto(Integer idProducto);
    public Producto saveProducto(Producto producto);
    public void deleteProducto(Integer idProducto);
}
