package org.example.ejercicio1;

import java.util.Scanner;

public class Operacion {
    private int numero1;
    private int numero2;

    public Operacion() {

    }

    public Operacion(int numero1, int numero2) {
        this.numero1 = numero1;
        this.numero2 = numero2;
    }

    public int getNumero1() {
        return numero1;
    }

    public int getNumero2() {
        return numero2;
    }

    public void setNumero1(int numero1) {
        this.numero1 = numero1;
    }

    public void setNumero2(int numero2) {
        this.numero2 = numero2;
    }

    public void crearOperacion() {

        Scanner input = new Scanner(System.in);
        System.out.print("Por favor, ingrese el primer número para realizar la operación: ");
        int num1 = Integer.parseInt(input.nextLine());
        System.out.print("Por favor, ingrese el segundo número para realizar la operación: ");
        int num2 = Integer.parseInt(input.nextLine());

        setNumero1(num1);
        setNumero2(num2);
    }

    public int sumar() {
        return numero1 + numero2;
    }

    public int restar() {
        return numero1 - numero2;
    }

    public int multiplicar() {
        if(numero1 == 0 || numero2 == 0) {
            System.out.println("Error al intentar multiplicar por cero");
            return 0;
        }
        else {
            return numero1 * numero2;
        }
    }

    public int dividir() {
        if(numero2 == 0) {
            System.out.println("Error! No se puede dividir por cero");
            return 0;
        }
        else {
            return numero1 / numero2;
        }
    }
}
