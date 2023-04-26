/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicios_Calculadora;

import ejercicios_Calculadora.Entidades.Operacion;
import ejercicios_Calculadora.Servicios.ServicioCrearOperacion;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class CalculadoraMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner leer = new Scanner(System.in);

       // Operacion op = new Operacion();
        ServicioCrearOperacion sop = new ServicioCrearOperacion();

        Operacion C = sop.CrearOperacion();

        int opcion;
        do {
            System.out.println("Ingrese una operacion:" + "\n"
                    + "1 - SUMA\n"
                    + "2 - RESTA\n"
                    + "3 - MULTIPLICACION\n"
                    + "4 - DIVISION\n");
            opcion = leer.nextInt();
            
            
            switch (opcion) {
                case 1:
                    int suma = sop.Sumar(C.getNum1(), C.getNum2());
                    System.out.println(suma);
                    break;
                case 2:
                   int resta = sop.Restar(C.getNum1(), C.getNum2());
                   System.out.println(resta);
                    break;
                case 3:
                   int multi = sop.Multiplicar(C.getNum1(), C.getNum2());
                    System.out.println(multi);
                    break;
                case 4:
                    double div = sop.Dividir(C.getNum1(), C.getNum2());
                    System.out.println(div);
                    break;
                default:
                    System.out.println("La opcion ingresada es incorrecta");
            }
        } while (opcion > 4 || opcion < 1);
    }

}
