package com.ejercicio2;

public class EjercicioTema2 {

    public static void main(String[] args) {

        double iva = conIva(10);
    }

    static double conIva(double precioProducto) {
        double precioConIva = precioProducto * 0.21;
        double resultado = precioProducto + precioConIva;
        System.out.println("Precio producto: " + precioProducto);
        System.out.println("Precio producto con iva incluido: " + precioProducto);
        return resultado;

    }
}
