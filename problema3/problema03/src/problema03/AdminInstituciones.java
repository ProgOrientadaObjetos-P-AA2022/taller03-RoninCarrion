/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package problema03;

/**
 *
 * @author ronni
 */
public class AdminInstituciones {

    private String nombre;
    private String tipo;
    private int numAlumnos;
    private int numDocentes;
    private int numSedes;
    private double proyEstudiantes;
    private double presupuesto;

    public void establecerNombre(String a) {
        nombre = a;
    }

    public void establecertipo(String a) {
        tipo = a;
    }

    public void establecerNumAlumnos(int a) {
        numAlumnos = a;
    }

    public void establecernumDocentes(int a) {
        numDocentes = a;
    }

    public void establecerNumSedes(int a) {
        numSedes = a;
    }

    public void establecerProyEstudiantes(double a) {
        proyEstudiantes = a;
    }

    public void establecerPresupuesto() {
        presupuesto = proyEstudiantes * numAlumnos;
    }

    public String obtenerNombre() {
        return nombre;
    }

    public String obtenertipo() {
        return tipo;
    }

    public int obtenerNumAlumnos() {
        return numAlumnos;
    }

    public int obtenernumDocentes() {
        return numDocentes;
    }

    public int obtenerNumSedes() {
        return numSedes;
    }

    public double obtenerProyEstudiantes() {
        return proyEstudiantes;
    }

    public double obtenerPresupuesto() {
        return presupuesto;
    }
}
