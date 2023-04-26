/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicios_CuentaBancria.Servicios;

import ejercicios_CuentaBancria.Entidades.CuentaBancaria;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class CuentaBancariaServicios {

    private final List<CuentaBancaria> cuentas;
    private final Scanner leer = new Scanner(System.in);
    //*private CuentaBancaria Cuenta;

    public CuentaBancariaServicios() {
        cuentas = new ArrayList<>();
    }

    // forma 1 de crear cuenta
    public CuentaBancaria CrearCuenta() {
        boolean existe = false;
        int NCuenta = 0;
        do {

            System.out.println("Ingrese el numero de cuenta del cliente");
            NCuenta = leer.nextInt();
            for (CuentaBancaria cuenta : cuentas) {
                existe = false;
                if (cuenta.getNumeroCuenta() == NCuenta) {
                    System.out.println("La cuenta ya exixte");
                    existe = true;
                    break;
                }
            }
        } while (existe == true);

        if (existe == false) {
            System.out.println("Ingrese el numero de DNI del cliente");
            long Dni = leer.nextLong();
            CuentaBancaria A = new CuentaBancaria(NCuenta, Dni, 0.0);
            cuentas.add(A);
            System.out.println("Cuenta Creada con exito");
            return new CuentaBancaria(NCuenta, Dni, 0.0);
        }
        return null;
    }
    public void Ingresar(int cuentaBan, double cantidad) {
        boolean encontrado = false;
        for (CuentaBancaria cuenta : cuentas) {
            if (cuenta.getNumeroCuenta() == cuentaBan) {
                double saldo = cuenta.getSaldoActual() + cantidad;
                cuenta.setSaldoActual(saldo);
                encontrado = true;
                System.out.println("Depósito realizado con éxito.");
                break;
            }
            if (encontrado == false) {
                System.out.println("No se encuentra N de cuenta");
            }
        }
    }
    /*Método retirar(double): recibe una cantidad de dinero a retirar y se le restara al saldo actual. 
    Si la cuenta no tiene la cantidad de dinero a retirar se retirará el máximo posible hasta dejar la cuenta en 0.*/
    public void Retirar(int cuentaBan, double cantidad) {
        boolean encontrado = false;
        for (CuentaBancaria cuenta : cuentas) {
            if (cuenta.getNumeroCuenta() == cuentaBan) {
                if (cuenta.getSaldoActual() >= cantidad) {
                    double saldo = cuenta.getSaldoActual() - cantidad;
                    cuenta.setSaldoActual(saldo);
                    System.out.println("Retiro realizado con éxito.");
                    System.out.println("Su nuevo saldo luego del retiro es: " + saldo);
                } else {
                    System.out.println("Su saldo en insuficiente, se retirara el saldo maximo: " + cuenta.getSaldoActual());
                    cuenta.setSaldoActual(0.0);
                    System.out.println("en su cuenta queda un saldo de: " + cuenta.getSaldoActual());
                }
                encontrado = true;
                break;
            }
        }
        if (encontrado == false) {
            System.out.println("No se encuentra N de cuenta");
        }
    }

    /*Método extraccionRapida: le permitirá sacar solo un 20% de su saldo. 
        Validar que el usuario no saque más del 20%.*/
    public void ExtraccionRapida(int cuentaBan, double cantidad) {
        boolean encontrado = false;
        for (CuentaBancaria cuenta : cuentas) {
            if (cuenta.getNumeroCuenta() == cuentaBan) {
                if (cuenta.getSaldoActual() * 0.2 > cantidad) {
                    double saldo = cuenta.getSaldoActual() - cantidad;
                    cuenta.setSaldoActual(saldo);
                    System.out.println("su extacccion tuvo exito su nuevo saldo es:  " + cuenta.getSaldoActual());
                } else {
                    System.out.println("La extraccion supera el 20% de su saldo reintente");
                }
                encontrado = true;
                break;
            }
        }
        if (encontrado == false) {
            System.out.println("El numero de cuenta no se encuentra");
        }

    }

    public double consultarSaldo(int cuentaBan) {
        boolean encontrado = false;
        for (CuentaBancaria cuenta : cuentas) {
            if (cuenta.getNumeroCuenta() == cuentaBan) {
                //System.out.println("El saldo de la cuenta: " + cuenta.getNumeroCuenta() + " es de " + cuenta.getSaldoActual());
                encontrado = true;
                return cuenta.getSaldoActual();
            }
            break;
        }
        if (encontrado == false) {
            System.out.println("La cuenta ingresada no es correcta");
            return 0.0;
        }
        return 0.0;
    }

    public CuentaBancaria datosCuenta(int cuentaBan) {
        boolean encontrado = false;
        for (CuentaBancaria cuenta : cuentas) {
            if (cuenta.getNumeroCuenta() == cuentaBan) {
                //System.out.println("El saldo de la cuenta: " + cuenta.getNumeroCuenta() + " es de " + cuenta.getSaldoActual());
                encontrado = true;
                return cuenta;
            }
            break;
        }
        if (encontrado == false) {
            System.out.println("La cuenta ingresada no es correcta");
            return null;
        }
        return null;
    }
}
