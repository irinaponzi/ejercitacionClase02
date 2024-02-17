package org.example.ejercicio3;

public class Circulo implements calculosFormas {

    private double radio;

    public Circulo() {

    }

    public Circulo(double radio) {
        this.radio = radio;
    }

    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }

    @Override
    public double calcularArea() {
        return PI * Math.pow(radio, 2);
    }

    @Override
    public double calcularPerimetro() {
        return 2 * PI * radio;
    }

    @Override
    public String toString() {
        return "CIRCULO - Radio: " + radio;
    }
}
