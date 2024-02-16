package org.example;

import org.example.ejercicio1.Operacion;
import org.example.ejercicio2.Cuenta;
import org.example.ejercicio3.Circulo;
import org.example.ejercicio3.Rectangulo;
import org.example.ejercicio3.calculosFormas;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        // Ejercicio 1
       /* Operacion operacion1 = new Operacion(5, 4);
        Operacion operacion2 = new Operacion();

        int num1 = operacion1.getNumero1();
        int num2 = operacion1.getNumero2();
        System.out.println("Los números con los que se operará son: " + num1 + " y " + num2);

        System.out.println("Suma = " + operacion1.sumar());
        System.out.println("Resta = " + operacion1.restar());
        System.out.println("Multiplicación = " + operacion1.multiplicar());
        System.out.println("División = " + operacion1.dividir());

        operacion2.crearOperacion();
        System.out.println("Suma = " + operacion2.sumar());
        System.out.println("Resta = " + operacion2.restar());
        System.out.println("Multiplicación = " + operacion2.multiplicar());
        System.out.println("División = " + operacion2.dividir());

        // Ejercicio 2

        Cuenta cuenta1 = new Cuenta();
        Cuenta cuenta2 = new Cuenta();
        Cuenta cuenta3 = new Cuenta();
        Cuenta cuenta4 = new Cuenta();
        Cuenta cuenta5 = new Cuenta();

        cuenta1.getNumeroCuenta();
        cuenta2.getNumeroCuenta();
        cuenta3.getNumeroCuenta();
        cuenta4.getNumeroCuenta();
        cuenta5.getNumeroCuenta();

        cuenta1.getSaldoActual(); */

        // Ejercicio 3

        List<calculosFormas> formasLista = new ArrayList<>();
        formasLista.add(new Circulo(35));
        formasLista.add(new Circulo(15));
        formasLista.add(new Rectangulo(45, 60));
        formasLista.add(new Rectangulo(5, 8));

        formasLista.forEach(forma ->
                System.out.println(forma +
                    "\nSu área es: " + forma.calcularArea() +
                    "\nSu perímetro es: " + forma.calcularPerimetro()));


        // Agregar a todas las clases el TOString
        // Preguntar el tema de getters y setters
        // ver el tema del numero de cuenta
        // Preguntar el tema de una clase creando objetos de su propia clase
        // ver excepciones más que nada en los pedidos por consola
    }
}