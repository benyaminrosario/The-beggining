/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author benya
 */
public class Calculadora {
    
    public double sumar(double a, double b) {
        return a + b;
    }

    public double restar(double a, double b) {
        return a - b;
    }

    public double multiplicar(double a, double b) {
        return a * b;
    }

    public double dividir(double a, double b) {
        return a / b;
    }

    public double raizCuadrada(double numero) {
        return Math.sqrt(numero);
    }

    public double potencia(double base, double exponente) {
        return Math.pow(base, exponente);
    }

    public double fahrenheitACelsius(double f) {
        return (f - 32) * 5 / 9;
    }

    public double celsiusAFahrenheit(double c) {
        return (c * 9 / 5) + 32;
    }


}
