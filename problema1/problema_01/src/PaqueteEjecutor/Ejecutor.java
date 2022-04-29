/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PaqueteEjecutor;
import problema_01.Terreno;
/**
 *
 * @author ronni
 */
public class Ejecutor {
    public static void main(String[] args) {
        Terreno terreno = new Terreno();
        double ancho = 20;
        double largo = 40.5;
        double valorMetroCuadrado = 20;
        
        // llamar a los métodos
        terreno.establecerAncho(ancho);
        terreno.establecerLargo(largo);
        terreno.establecerValorMetroCuadrado(valorMetroCuadrado);
        
        terreno.establecerArea();
        terreno.establecerCostoTerreno();
        
        System.out.printf("Datos obtenidos del terreno\n"
                        + "--------------------------------------------\n"
                        + "Valor del metro cuadrado del terreno: %.2f\n"
                        + "Ancho del terreno: %.2f\n"
                        + "Largo del terreno: %.2f\n"
                        + "Área del terreno: %.2f\n"
                        + "Valor Total del terreno: %.2f\n",
                        terreno.obtenerValorMetroCuadado(),
                        terreno.obtenerAncho(),
                        terreno.obtenerLargo(),
                        terreno.obtenerArea(),
                        terreno.obtenerCostoTerreno());
    }
}
