/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicios_Radio.Servicios;

import ejercicios_Radio.Entidades.Circunsferencia;
import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class ServicioCircunsferencia {
    
    private Scanner leer = new Scanner(System.in).useDelimiter("\n");
    
    
    public Circunsferencia CrearCircunsferencia(){
        
        System.out.println("introducir radio m");
        Double radio = leer.nextDouble();
                
        return new Circunsferencia(radio);
    }

    public Double CalcularArea(Double radio){
        // (Area=〖π*radio〗^2
        Double Area =3.141516 * Math.pow(radio,2) ;
        
        return Area;
        
    }
    
        public Double CalcularPerimetro(Double radio){
  
        Double Perimetro =2*3.141516*radio;
        
        return Perimetro;
        
    }

    
}
