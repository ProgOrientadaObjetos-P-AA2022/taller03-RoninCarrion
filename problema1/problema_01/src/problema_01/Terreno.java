/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package problema_01;

/**
 *
 * @author ronni
 */
public class Terreno {

    private double costo_terreno;
    private double ancho;
    private double largo;
    private double area;
    private double valorMetroCuadrado;

    public void establecerAncho(double a) {
        ancho = a;
    }

    public void establecerLargo(double a) {
        largo = a;
    }

    public void establecerArea() {
        area = largo * ancho;
    }

    public void establecerValorMetroCuadrado(double a) {
        valorMetroCuadrado = a;
    }

    public void establecerCostoTerreno() {
        costo_terreno = valorMetroCuadrado * area;
    }

    public double obtenerAncho() {
        return ancho;
    }

    public double obtenerLargo() {
        return largo;
    }

    public double obtenerArea() {
        return area;

    }

    public double obtenerValorMetroCuadado() {
        return valorMetroCuadrado;
    }

    public double obtenerCostoTerreno() {
        return costo_terreno;
    }
}
