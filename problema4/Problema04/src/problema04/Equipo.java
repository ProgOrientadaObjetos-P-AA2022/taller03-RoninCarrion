/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package problema04;

/**
 *
 * @author ronni
 */
public class Equipo {

    private String sistemaOp;
    private double tamañoPantalla;
    private double costoInicial;
    private double iva;
    private double ivaCostoInicial;
    private double costoFinal;
    private String dirMac;
    private String infImei;

    public void establecerSistemaOperativo(String a) {
        sistemaOp = a;
    }

    public void establecerTamañoPantalla(double a) {
        tamañoPantalla = a;
    }

    public void establecerCostoInicial(double a) {
        costoInicial = a;
    }

    public void establecerIva(double a) {
        iva = a;
    }

    public void establecerIvaCostoInicial() {
        ivaCostoInicial = costoInicial * iva;
    }

    public void establecerCostoFinal() {
        costoFinal = ivaCostoInicial + costoInicial;
    }

    public void establecerDirMac(String a) {
        dirMac = a;
    }
    public void establecerInfIMEI(String a){
        infImei = a;
    }
    public String obtenerSistemaOperativo() {
        return sistemaOp;
    }
    public double obtenerTamañoPantalla() {
        return tamañoPantalla;
    }

    public double obtenerCostoInicial() {
        return costoInicial;
    }

    public double obtenerIva() {
        return iva;
    }

    public double obtenerIvaCostoInicial() {
        return ivaCostoInicial;
    }

    public double obtenerCostoFinal() {
        return costoFinal;
    }

    public String obtenerDirMac() {
        return dirMac;
    }
    public String obtenerinfIMEI(){
        return infImei;
    }
    
}
