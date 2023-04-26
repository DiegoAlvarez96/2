/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicios_Figura.Servicios;

import ejercicios_Figura.Entidades.Rectangulo;
import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class ServiciosRectangulo {

    private Scanner leer = new Scanner(System.in);

    public Rectangulo CrearRectangulo() {

        System.out.println("Ingrese la base rectangulpo");
        double base = leer.nextDouble();
        System.out.println("Ingrese la altura del rectangulo");
        double area = leer.nextDouble();
        
        return new Rectangulo(area, base);
    }

    public double calularperimetro(double base, double altura){
        double perimetro = base*2 + altura *2;
        return perimetro;
    }
    
    public double calularsuperficie(double base, double altura){
        double superfice = base* altura;
        return superfice;
    }
    
    

    
    
    
    
}
