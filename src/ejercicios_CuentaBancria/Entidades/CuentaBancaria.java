/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicios_CuentaBancria.Entidades;

/**
 *
 * @author Usuario
 */
public class CuentaBancaria {

    private int NumeroCuenta;
    private long dniCliente;
    private double SaldoActual;

    public CuentaBancaria() {
    }

    public CuentaBancaria(int NumeroCuenta, long dniCliente, double SaldoActual) {
        this.NumeroCuenta = NumeroCuenta;
        this.dniCliente = dniCliente;
        this.SaldoActual = SaldoActual;
    }

    public int getNumeroCuenta() {
        return NumeroCuenta;
    }

    public long getDniCliente() {
        return dniCliente;
    }

    public double getSaldoActual() {
        return SaldoActual;
    }

    public void setNumeroCuenta(int NumeroCuenta) {
        this.NumeroCuenta = NumeroCuenta;
    }

    public void setDniCliente(long dniCliente) {
        this.dniCliente = dniCliente;
    }

    public void setSaldoActual(double SaldoActual) {
        this.SaldoActual = SaldoActual;
    }

    @Override
    public String toString() {
        return "CuentaBancaria{" + "NumeroCuenta=" + NumeroCuenta + ", dniCliente=" + dniCliente + ", SaldoActual=" + SaldoActual + '}';
    }

    
    
}
