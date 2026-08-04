/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author benya
 */


public class ProcesarDatos {

    // Atributos privados
    private String matricula;
    private String nombres;
    private String apellidos;
    private String cuatrimestre;

    // Constructor vacío
    public ProcesarDatos() {
    }

    // Método para capturar los datos
    public void capturarDatos(String matricula, String nombres, String apellidos, String cuatrimestre) {
        this.matricula = matricula;
        this.nombres = nombres;
        this.apellidos = apellidos;
        this.cuatrimestre = cuatrimestre;
    }

    // Método para presentar los datos
    public String presentarDatos() {
        return "===== DATOS DEL ESTUDIANTE ====="
                + "\n\nMatrícula: " + matricula
                + "\nNombres: " + nombres
                + "\nApellidos: " + apellidos
                + "\nCuatrimestre: " + cuatrimestre;
    }

    // Getters (opcionales)
    public String getMatricula() {
        return matricula;
    }

    public String getNombres() {
        return nombres;
    }

    public String getApellidos() {
        return apellidos;
    }

    public String getCuatrimestre() {
        return cuatrimestre;
    }

    // Setters (opcionales)
    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public void setCuatrimestre(String cuatrimestre) {
        this.cuatrimestre = cuatrimestre;
    }
}

