package org.example.ejercicio1;

import java.util.Scanner;

public class Operacion {

    private float numero1;
    private float numero2;

    public Operacion() {

    }

    public Operacion(float numero1, float numero2) {
        this.numero1 = numero1;
        this.numero2 = numero2;
    }

    public float getNumero1() {
        return numero1;
    }

    public float getNumero2() {
        return numero2;
    }

    public void setNumero1(float numero1) {
        this.numero1 = numero1;
    }

    public void setNumero2(float numero2) {
        this.numero2 = numero2;
    }

    public void crearOperacion() {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Por favor, ingrese el primer número para realizar la operación: ");
        String input1 = scanner.nextLine();
        System.out.print("Por favor, ingrese el segundo número para realizar la operación: ");
        String input2 = scanner.nextLine();

        try {

            float num1 = Float.parseFloat(input1);
            float num2 = Float.parseFloat(input2);

            setNumero1(num1);
            setNumero2(num2);
        }
        catch (NumberFormatException e) {
            System.out.println("Error de formato! No ingresó un número válido");
        }
    }

    public float sumar() {
        return numero1 + numero2;
    }

    public float restar() {
        return numero1 - numero2;
    }

    public float multiplicar() {
        if(numero1 == 0 || numero2 == 0) {
            System.out.println("Error al intentar multiplicar por cero");
            return 0;
        }
        else {
            return numero1 * numero2;
        }
    }

    public float dividir() {
        if(numero2 == 0) {
            System.out.println("Error! No se puede dividir por cero");
            return 0;
        }
        else {
            return numero1 / numero2;
        }
    }

    @Override
    public String toString() {
        return "Número1: " + numero1 + " - Número2: " + numero2;
    }
}
