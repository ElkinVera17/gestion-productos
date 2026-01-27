package com.ferreteria.service;

import java.util.List;
import com.ferreteria.model.Producto;

public class ProductoService {

    public double calcularValorTotal(List<Producto> productos) {
        return productos.stream()
                .mapToDouble(p -> p.getPrecio() * p.getStock())
                .sum();
    }
}
