/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicios_Radio;

import ejercicios_Radio.Entidades.Circunsferencia;
import ejercicios_Radio.Servicios.ServicioCircunsferencia;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class mainRa {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        /**
         * Declarar una clase llamada Circunferencia que tenga como atributo
         * privado el radio de tipo real. A continuación, se deben crear los
         * siguientes métodos: Método constructor que inicialice el radio pasado
         * como parámetro. Métodos get y set para el atributo radio de la clase
         * Circunferencia. Método para crearCircunferencia(): que le pide el
         * radio y lo guarda en el atributo del objeto. Método area(): para
         * calcular el área de la circunferencia (Area=〖π*radio〗^2). Método
         * perimetro(): para calcular el perímetro (Perimetro=2*π*radio).
         */

        Scanner leer = new Scanner(System.in).useDelimiter("\n");

        double radio;

        //Crear Circunsferencia sin metodo
        //System.out.println("Ingrese el radio");
        // radio = leer.nextDouble();
        // Circunsferencia C1 = new Circunsferencia(radio);
        //Crear Circunsferencia mediante metodo
        ServicioCircunsferencia sc = new ServicioCircunsferencia();
        Circunsferencia C = sc.CrearCircunsferencia();

        // modifica el radio de C1
        //    C1.setRadio(leer.nextDouble());
        // Consulta el radio de C1
        //System.out.println(C1.getRadio());
        System.out.println("strin \n" + C.toString());

        //pedido de calculo de area por metodo
        Double Area = sc.CalcularArea(C.getRadio());
        System.out.println("Area: " + Area);
        
        
        //pedido de calculo de perimetro
        Double Perimetro = sc.CalcularPerimetro(C.getRadio());
        System.out.println("El perimetro es: "+ Perimetro);

    }

}
