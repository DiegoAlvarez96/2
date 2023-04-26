/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicios_Calculadora.Servicios;

import ejercicios_Calculadora.CalculadoraMain;
import ejercicios_Calculadora.Entidades.Operacion;
import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class ServicioCrearOperacion {

    private Scanner leer = new Scanner(System.in);

    public Operacion CrearOperacion() {
        System.out.println("Ingrese el numero 1");
        int num1 = leer.nextInt();
        System.out.println("Ingrese el numero 2");
        int num2 = leer.nextInt();

        return  new Operacion(num1, num2);

    }

    public int Sumar(int num1, int num2) {
        int suma = num1 + num2;
        return suma;

    }

    public int Restar(int num1, int num2) {
        int resta = num1 - num2;
        return resta;

    }

    public int Multiplicar(int num1, int num2) {
        int multiplicar;
        if (num1 == 0 || num2 == 0) {
            System.out.println("Un numero ingresado es 0 por lo que el producto es 0");
            return 0;
        } else {
            multiplicar = num1 * num2;
        }
        return multiplicar;
    }
    
    public double Dividir (double num1, double num2) {
        double dividir;
        if (num1 == 0 || num2 == 0) {
            System.out.println("Un numero ingresado es 0 por lo que la division es 0 [Error] ");
            return 0;
        } else {
            dividir = num1 / num2;
            return dividir;
        }
        
    }

    
    
}
