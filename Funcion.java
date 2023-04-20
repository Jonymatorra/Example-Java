package com.example;

public class Funcion {
    public static void main(String[] args) {
        double producto = 130.70;
        double iva = 0.21;
        double precio = obtenerPrecio(producto,iva);
        System.out.println(precio);
    }

    static double obtenerPrecio(double producto, double iva){
        return producto * iva;

    }
}
