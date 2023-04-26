/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicios_Figura;

import ejercicios_Figura.Entidades.Rectangulo;
import ejercicios_Figura.Servicios.ServiciosRectangulo;
import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class Figuras {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        /*  Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese la base");
        double base = leer.nextDouble();

        System.out.println("Ingrese la base");
        double area = leer.nextDouble
         */
        ServiciosRectangulo srec = new ServiciosRectangulo();

        Rectangulo R = srec.CrearRectangulo();

        double per = srec.calularperimetro(R.getBase(), R.getAltura());
        double sup = srec.calularsuperficie(R.getBase(), R.getAltura());

        System.out.println("Perimetro es:" + per);
        System.out.println("Superfice es:" + sup);

        for (int i = 0; i < R.getBase(); i++) {
            for (int j = 0; j < R.getAltura(); j++) {
                if (i == 0 || i == R.getBase() - 1 || j == 0 || j == R.getAltura() - 1) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
                System.out.print(" ");
            }
            System.out.println(" ");
        }
    }

}
