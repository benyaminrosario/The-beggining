/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author benya
 */
public class Estudiantes {

    String nombre;
    String matricula;
    String carrera;

    double practicas;
    double parciales;
    double asignaciones;
    double examenFinal;

    public Estudiantes(String nombre, String matricula, String carrera,
                       double practicas, double parciales,
                       double asignaciones, double examenFinal) {

        this.nombre = nombre;
        this.matricula = matricula;
        this.carrera = carrera;

        this.practicas = practicas;
        this.parciales = parciales;
        this.asignaciones = asignaciones;
        this.examenFinal = examenFinal;
    }

    public double calcularNota() {
        return practicas + parciales + asignaciones + examenFinal;
    }

    public String obtenerResultado() {

        if (calcularNota() >= 60) {
            return "APROBADO";
        } else {
            return "REPROBADO";
        }

    }

}