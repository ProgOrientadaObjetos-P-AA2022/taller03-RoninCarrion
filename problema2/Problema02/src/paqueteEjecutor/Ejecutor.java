/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package paqueteEjecutor;
import problema02.EquivalenteHora;
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
        EquivalenteHora Equivalencia = new EquivalenteHora();
        double horas = 54;
        
        Equivalencia.establecerHoras(horas);
        
        Equivalencia.establecerMinutos();
        Equivalencia.establecerSegundos();
        Equivalencia.establecerDias();
        
        System.out.printf("El equivalente de %.2f en minutos, segundos y días es:\n"
                + "%.2f Minutos\n%.2f Segundos\n%.2f Días\n",
                Equivalencia.obtenerHoras(),
                Equivalencia.obtenerMinutos(),
                Equivalencia.obtenerSegundos(),
                Equivalencia.obtenerDias());
    }
    
}
