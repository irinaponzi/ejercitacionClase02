package org.example.ejercicio2;


public class Cuenta {

    private long numeroCuenta;
    private String nombre;
    private String apellido;
    private long dni;
    private double saldoActual;

    public Cuenta() {

    }

    public Cuenta(long numeroCuenta, String nombre, String apellido, long dni, double saldoActual) {
        this.numeroCuenta = numeroCuenta;
        this.nombre = nombre;
        this.apellido = apellido;
        this.dni = dni;
        this.saldoActual = saldoActual;
    }

    public long getNumeroCuenta() {
        return numeroCuenta;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public long getDni() {
        return dni;
    }

    public double getSaldoActual() {
        return saldoActual;
    }

    public void setNumeroCuenta(long numeroCuenta) {
        this.numeroCuenta = numeroCuenta;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public void setDni(long dni) {
        this.dni = dni;
    }

    public void setSaldoActual(double saldoActual) {
        this.saldoActual = saldoActual;
    }

    public void ingresar(double ingreso) {
        saldoActual += ingreso;
        System.out.println("Ingreso exitoso. Su saldo actual es de $" + saldoActual);
    }

    public void retirar(double retiro) {
        if(saldoActual >= retiro) {
            saldoActual -= retiro;
            System.out.println("Retiro exitoso. Usted ha retirado $" + retiro +
                    ". Su saldo actual es de $" + saldoActual);
        }
        else {
            double resto = saldoActual;
            saldoActual = 0;
            System.out.println("Saldo insuficiente para retirar $" + retiro + ". Usted ha retirado $" +
                    resto + ". Su saldo actual es de $" + saldoActual);
        }
    }

    public void extraccionRapida() {
        double extraccion = saldoActual * 0.2;
        saldoActual -= extraccion;
        System.out.println("Extracción rápida exitosa. Usted ha retirado $" + extraccion +
                ". Su saldo actual es de $" + saldoActual);
    }

    public void consultarSaldo() {
        System.out.println("Su saldo actual es de $" + saldoActual);
    }

    public void consultarDatos() {
        System.out.println("Los datos de su cuenta son:\n" + toString());
    }

    @Override
    public String toString() {
        return "Número de Cuenta: " + numeroCuenta + "\nNombre: " + nombre + "\nApellido: " + apellido +
                "\nDNI: " + dni + "\nSaldo actual: $" + saldoActual;
    }
}
