package org.example.ejercicio2;

import java.util.Scanner;

public class Cuenta {
    private int numeroCuenta;
    private String nombreCliente;
    private String apellidoCliente;
    private long dniCLiente;
    private double saldoActual;

    public Cuenta() {

    }

    public Cuenta(int numeroCuenta, String nombreCliente, String apellidoCliente, long dniCLiente, double saldoActual) {
        this.numeroCuenta = numeroCuenta;
        this.nombreCliente = nombreCliente;
        this.apellidoCliente = apellidoCliente;
        this.dniCLiente = dniCLiente;
        this.saldoActual = saldoActual;
    }

    public int getNumeroCuenta() {
        return numeroCuenta;
    }

    public String getNombreCliente() {
        return nombreCliente;
    }

    public String getApellidoCliente() {
        return apellidoCliente;
    }

    public long getDniCLiente() {
        return dniCLiente;
    }

    public double getSaldoActual() {
        return saldoActual;
    }

    public void setNumeroCuenta(int numeroCuenta) {
        this.numeroCuenta = numeroCuenta;
    }

    public void setNombreCliente(String nombreCliente) {
        this.nombreCliente = nombreCliente;
    }

    public void setApellidoCliente(String apellidoCliente) {
        this.apellidoCliente = apellidoCliente;
    }

    public void setDniCLiente(long dniCLiente) {
        this.dniCLiente = dniCLiente;
    }

    public void setSaldoActual(double saldoActual) {
        this.saldoActual = saldoActual;
    }

    public static Cuenta crearCuenta() {

        Scanner input = new Scanner(System.in);
        System.out.print("Por favor, ingrese el número de cuenta: ");
        int numCuenta = Integer.parseInt(input.nextLine());
        System.out.print("Por favor, ingrese el nombre del cliente: ");
        String nombre = input.nextLine();
        System.out.print("Por favor, ingrese el apellido del cliente: ");
        String apellido = input.nextLine();
        System.out.print("Por favor, ingrese el DNI del cliente: ");
        long dni = Long.parseLong(input.nextLine());
        System.out.print("Por favor, ingrese el saldo de la cuenta: ");
        double saldo = Double.parseDouble(input.nextLine());

        return new Cuenta(numCuenta, nombre, apellido, dni, saldo);
    }


}
