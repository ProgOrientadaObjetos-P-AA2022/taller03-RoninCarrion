/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package paqueteEjecutor;

import problema03.AdminInstituciones;

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
        AdminInstituciones admin = new AdminInstituciones();
        // Variables
        String nombreInstitucion = "Unidad Educativa Fiscal Lauro Guerrero";
        String tipoInstitucion = "Fiscal";
        int numAlumnos = 2000;
        int numDocentes = 60;
        int numSedes = 1;
        double gastosProyectados = 200;
        
        admin.establecerNombre(nombreInstitucion);
        admin.establecertipo(tipoInstitucion);
        admin.establecerNumAlumnos(numAlumnos);
        admin.establecernumDocentes(numDocentes);
        admin.establecerNumSedes(numSedes);
        admin.establecerProyEstudiantes(gastosProyectados);
        
        admin.establecerPresupuesto();
        System.out.printf("Información Obtenida\n"
                        + "-----------------------------\n"
                        + "Nombre de la Institución: %s\n"
                        + "Tipo de Institución: %s\n"
                        + "Número de Alumnos en la institución: %d\n"
                        + "Número de docentes en la Institución: %d\n"
                        + "Número de Sedes: %d\n"
                        + "Proyección de gastos por estudiante: $%.2f\n"
                        + "Presupuesto de la Institución: $%.2f\n",
                        admin.obtenerNombre(),
                        admin.obtenertipo(),
                        admin.obtenerNumAlumnos(),
                        admin.obtenernumDocentes(),
                        admin.obtenerNumSedes(),
                        admin.obtenerProyEstudiantes(),
                        admin.obtenerPresupuesto());
    }
    
}
