package com.ferreteria.model;

public class Producto {

    private String nombre;
    private double precio;
    private int stock;

    public Producto(String nombre, double precio, int stock) {
        if (precio < 0) {
            throw new IllegalArgumentException("El precio no puede ser negativo");
        }
        this.nombre = nombre;
        this.precio = precio;
        this.stock = stock;
    }

    public double getPrecio() {
        return precio;
    }

    public int getStock() {
        return stock;
    }
    
    public String getNombre() {
        return nombre;
    }

    public void aumentarStock(int cantidad) {
        this.stock += cantidad;
    }
}
