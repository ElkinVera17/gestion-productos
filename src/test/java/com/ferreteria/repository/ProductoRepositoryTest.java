package com.ferreteria.repository;

import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

import com.ferreteria.model.Producto;

class ProductoRepositoryTest {

    @Test
    void guardarProducto_enMongoDB() {
        ProductoRepository repo = new ProductoRepository();
        Producto producto = new Producto("Taladro", 50.0, 3);

        long antes = repo.contarProductos();
        repo.guardarProducto(producto);
        long despues = repo.contarProductos();

        assertTrue(despues > antes);
    }
}
