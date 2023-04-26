/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicios_Libros;

import ejercicios_Libros.Entidades.Libros;
import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class Ejercicios_java_Objetos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        /**
         * Crear una clase llamada Libro que contenga los siguientes atributos:
         * ISBN, Título, Autor, Número de páginas, y un constructor con todos
         * los atributos pasados por parámetro y un constructor vacío. Crear un
         * método para cargar un libro pidiendo los datos al usuario y luego
         * informar mediante otro método el número de ISBN, el título, el autor
         * del libro y el número de páginas.*
         */

        Scanner leer = new Scanner(System.in);

        String ISBN, Título, Autor;
        int Numpag;
         Libros L1 = new Libros();

        System.out.println("Ingrese el ISBN del libro");
        ISBN = leer.nextLine();
        System.out.println("Ingrese el Título del libro");
        Título = leer.nextLine();
        System.out.println("Ingrese el Autor del libro");
        Autor = leer.next();
        System.out.println("Ingrese la cantidad de paginas del libro");
        Numpag = leer.nextInt();
        
        L1.setAutor(Autor);
        L1.setISBN(ISBN);
        L1.setNumpag(Numpag);
        L1.setTítulo(Título);

        System.out.println(" Titulo: " + L1.getTítulo() + "\n"
                + " Autor: " + L1.getAutor()+ "\n"
                + " ISBN: " + L1.getISBN()+ "\n"
                + " Paginas: " + L1.getNumpag()+ "\n"
                + "");
        
        
        

        
        
        

    }

}
