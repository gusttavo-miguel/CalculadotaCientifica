package org.ifpe.testeSoftware;

public class CalculadoraCientifica {

    public double adicao(double a, double b) {
        return a + b;
    }

    public double subtracao(double a, double b) {
        return a - b;
    }

    public double multiplicacao(double a, double b) {
        return a * b;
    }

    public double divisao(double a, double b) {
        if (b == 0) {
            throw new IllegalArgumentException("Divisor não pode ser zero");
        }
        return a / b;
    }

    public double raizQuadrada(double a) {
        return Math.sqrt(a);
    }

    public double potencia(double a, double b) {
        return Math.pow(a, b);
    }

    public double seno(double a) {
        return Math.sin(a);
    }

    public double cosseno(double a) {
        return Math.cos(a);
    }

    public double tangente(double a) {
        return Math.tan(a);
    }

    public double logaritmo(double a) {
        return Math.log(a);
    }
}