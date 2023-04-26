/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicios_CuentaBancria;

import ejercicios_CuentaBancria.Entidades.CuentaBancaria;
import ejercicios_CuentaBancria.Servicios.CuentaBancariaServicios;
import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class CuentaMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in);

        CuentaBancariaServicios CBService = new CuentaBancariaServicios();
        CuentaBancaria CB = new CuentaBancaria();

        while (true) {
            System.out.println("*******************************");
            System.out.println("Bienvenido al sistema bancario.");
            System.out.println("Elija una opción:");
            System.out.println("1 - Crear cuenta.");
            System.out.println("2 - Ingresar dinero.");
            System.out.println("3 - Retirar dinero.");
            System.out.println("4 - Retiro rapido.");
            System.out.println("5 - Consultar saldo.");
            System.out.println("6 - Consultar datos de la cuenta.");
            System.out.println("7 - Salir.");
            System.out.println("----------------------------------");
            int opcion = leer.nextInt();
           
            switch (opcion) {
                case 1:
                    CuentaBancaria A = CBService.CrearCuenta();
                    System.out.println("Cuenta creada con exito. El número de cuenta es ");
                    
                    System.out.println(A.getNumeroCuenta());
                    break;
                case 2:
                    System.out.println("Ingrese el número de cuenta:");
                    int numeroCuenta = leer.nextInt();
                    System.out.println("Ingrese la cantidad a depositar:");
                    double cantidadDepositar = leer.nextDouble();
                    CBService.Ingresar(numeroCuenta, cantidadDepositar);
                    //System.out.println(cuenta.getSaldoActual());
                   // System.out.println("El nuevo saldo de la cuenta: " + numeroCuenta + " es de: " + A.getSaldoActual());
                    break;
                case 3:
                    System.out.println("Ingrese el número de cuenta:");
                    numeroCuenta = leer.nextInt();
                    System.out.println("Ingrese la cantidad a retirar:");
                    double cantidadRetirar = leer.nextDouble();
                    CBService.Retirar(numeroCuenta, cantidadRetirar);
                    break;
                case 4:
                    System.out.println("Ingrese el número de cuenta:");
                    numeroCuenta = leer.nextInt();
                    System.out.println("Ingrese la cantidad a retirar:");
                    cantidadRetirar = leer.nextDouble();
                    CBService.ExtraccionRapida(numeroCuenta, cantidadRetirar);
                    break;
                case 5:
                    System.out.println("Ingrese el número de cuenta:");
                    numeroCuenta = leer.nextInt();
                    double saldo = CBService.consultarSaldo(numeroCuenta);
                    System.out.println("El saldo disponible en la cuenta es: " + saldo);
                    break;
                case 6:
                    System.out.println("Ingrese el número de cuenta:");
                    numeroCuenta = leer.nextInt();
                    CuentaBancaria datoscuenta = CBService.datosCuenta(numeroCuenta);
                    System.out.println(datoscuenta.toString());
                    break;
                case 7:
                    System.out.println("Gracias por utilizar nuestro servicio bancario.");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Opción inválida. Por favor, elija una opción del 1 al 7.");
                    break;
            }
        }
    }
}
