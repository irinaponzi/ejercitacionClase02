package org.example.ejercicio2;

import java.util.Scanner;

public class GestorCuentas {

    public static Cuenta crearCuenta() {

        Scanner scanner = new Scanner(System.in);

        try {

            System.out.print("Ingrese el número de cuenta: ");
            long numeroCuenta = Long.parseLong(scanner.nextLine());
            System.out.print("Ingrese el nombre del cliente: ");
            String nombre = scanner.nextLine();
            System.out.print("Ingrese el apellido del cliente: ");
            String apellido = scanner.nextLine();
            System.out.print("Ingrese el DNI del cliente: ");
            long dni = Long.parseLong(scanner.nextLine());
            System.out.print("Ingrese el saldo de la cuenta: ");
            double saldoActual = Double.parseDouble(scanner.nextLine());

            return new Cuenta(numeroCuenta, nombre, apellido, dni, saldoActual);
        }
        catch (NumberFormatException e) {
            System.out.println("Error, los datos ingresados no son válidos. La cuenta se creará vacía");
            return new Cuenta();
        }
    }
}
