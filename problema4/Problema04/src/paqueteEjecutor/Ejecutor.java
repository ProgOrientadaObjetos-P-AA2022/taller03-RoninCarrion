/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package paqueteEjecutor;

import problema04.Equipo;

/**
 *
 * @author ronni
 */
public class Ejecutor {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Equipo caract = new Equipo();
        // Variables
        String SistemaOp = "IOS";
        double tamPantalla = 6.70;
        double costoInicial = 950;
        double iva = 0.12;
        String dirMac = "00:1e:c2:9e:28:6b";
        String infImei = "123095748309485735";
        
        caract.establecerSistemaOperativo(SistemaOp);
        caract.establecerTamañoPantalla(tamPantalla);
        caract.establecerCostoInicial(costoInicial);
        caract.establecerIva(iva);
        caract.establecerIvaCostoInicial();
        caract.establecerCostoFinal();
        caract.establecerDirMac(dirMac);
        caract.establecerInfIMEI(infImei);
        
        System.out.printf("Información Obtenida:\n"
                        + "-----------------------------\n"
                        + "Sistema Operativo: %s\n"
                        + "Tamaño de la pantalla: %.2f\n"
                        + "IVA: %.2f\n"
                        + "IVA del dispositivo: %.2f\n"
                        + "Precio Final del sispositivo: %.2f\n"
                        + "Dirección MAC: %s\n"
                        + "Información IMEI: %s\n",
                        caract.obtenerSistemaOperativo(),
                        caract.obtenerTamañoPantalla(),
                        caract.obtenerIva(),
                        caract.obtenerIvaCostoInicial(),
                        caract.obtenerCostoFinal(),
                        caract.obtenerDirMac(),
                        caract.obtenerinfIMEI());
    }
    
}
