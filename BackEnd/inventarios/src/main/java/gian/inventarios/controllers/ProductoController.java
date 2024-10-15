package gian.inventarios.controllers;

import gian.inventarios.excepcion.NoEncontradoException;
import gian.inventarios.model.Producto;
import gian.inventarios.service.ProductoService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
//localhost:8080/inventario-app
@RequestMapping("inventario-app")
@CrossOrigin(value = "http://localhost:4200")
public class ProductoController {

    private static final Logger logger= LoggerFactory.getLogger(ProductoController.class);

    @Autowired
    private ProductoService productoService;

    //http://localhost:8080/inventario-app/productos
    @GetMapping("/productos")
    public List<Producto> getProductos(){
        List<Producto> productos = productoService.listarProductos();
        logger.info("Lista de Productos");
        productos.forEach((producto -> logger.info(producto.toString())));
        return productos;
    }


    @PostMapping("/productos")
    public Producto addProducto(@RequestBody Producto producto){
        logger.info("Producto nuevo: " + producto);
        return productoService.saveProducto(producto);
    }

    @GetMapping("/productos/{id}")
    public ResponseEntity<Producto> finfProductoById(@PathVariable int id){
        Producto producto = productoService.findByIdProducto(id);
        if(producto != null)
            return ResponseEntity.ok(producto);
        else
            throw new NoEncontradoException("No se encontro el id: " + id );
    }

    @PutMapping("/productos/{id}")
    public ResponseEntity<Producto> editProducto(@PathVariable int id, @RequestBody Producto producto){
        Producto productoEncontrado = this.productoService.findByIdProducto(id);
        if (productoEncontrado == null) {
            throw new NoEncontradoException("No se encontro el Producto");
        }
        productoEncontrado.setDescripcion(producto.getDescripcion());
        productoEncontrado.setPrecio(producto.getPrecio());
        productoEncontrado.setStock(producto.getStock());
        productoService.saveProducto(productoEncontrado);
        return ResponseEntity.ok(productoEncontrado);
    }

    @DeleteMapping("/productos/{id}")
    public ResponseEntity<Map<String, Boolean>> deleteProducto(@PathVariable int id){
        Producto productoEncontrado = this.productoService.findByIdProducto(id);
        if (productoEncontrado != null){
            this.productoService.deleteProducto(productoEncontrado.getIdProducto());
            Map<String, Boolean> respuesta = new HashMap<>();
            respuesta.put("Eliminado", Boolean.TRUE);
            return ResponseEntity.ok(respuesta);
        }else {
            throw new NoEncontradoException("No se encontro el producto");
        }
    }
}
