package org.example;

import org.example.ejercicio1.Operacion;
import org.example.ejercicio2.Cuenta;
import org.example.ejercicio3.Circulo;
import org.example.ejercicio3.Rectangulo;
import org.example.ejercicio3.calculosFormas;

import java.util.ArrayList;
import java.util.List;

import static org.example.ejercicio2.GestorCuentas.crearCuenta;

public class Main {
    public static void main(String[] args) {

        // Ejercicio 1
        System.out.println("EJERCICIO 01:");

        Operacion operacion1 = new Operacion(5, 4);
        Operacion operacion2 = new Operacion();

        float num1 = operacion1.getNumero1();
        float num2 = operacion1.getNumero2();
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
        System.out.println("EJERCICIO 02:");

        Cuenta miCuenta = crearCuenta();
        miCuenta.consultarDatos();

        miCuenta.ingresar(8500);
        miCuenta.retirar(9000);
        miCuenta.consultarSaldo();
        miCuenta.ingresar(20000);
        miCuenta.extraccionRapida();


        // Ejercicio 3
        System.out.println("EJERCICIO 03:");

        List<calculosFormas> formasLista = new ArrayList<>();
        formasLista.add(new Circulo(35));
        formasLista.add(new Circulo(15));
        formasLista.add(new Rectangulo(45, 60));
        formasLista.add(new Rectangulo(5, 8));

        formasLista.forEach(forma ->
                System.out.println(forma +
                    "\nSu área es: " + forma.calcularArea() +
                    "\nSu perímetro es: " + forma.calcularPerimetro()));
    }
}