package com.ferreteria.service;

import static org.junit.jupiter.api.Assertions.*;
import java.util.List;
import org.junit.jupiter.api.Test;
import com.ferreteria.model.Producto;

class ProductoServiceTest {

    @Test
    void calcularValorTotal_correcto() {
        Producto p1 = new Producto("Clavo", 1.0, 10);
        Producto p2 = new Producto("Martillo", 5.0, 2);

        ProductoService service = new ProductoService();
        double total = service.calcularValorTotal(List.of(p1, p2));

        assertEquals(20.0, total);
    }
    @Test
    void noPermitePrecioNegativo() {
        assertThrows(IllegalArgumentException.class, () -> {
            new Producto("Error", -5.0, 1);
        });
    }
}
