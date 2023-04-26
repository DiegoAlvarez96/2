/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicios_Libros.Entidades;

/**
 *
 * @author Usuario
 */
public class Libros {

    private String ISBN, Título, Autor;
    private int Numpag;

    
    public Libros() {
    }
    
    public Libros(String ISBN, String Título, String Autor, int Numpag) {
        this.ISBN = ISBN;
        this.Título = Título;
        this.Autor = Autor;
        this.Numpag = Numpag;
    }

    public void setISBN(String ISBN) {
        this.ISBN = ISBN;
    }

    public void setTítulo(String Título) {
        this.Título = Título;
    }

    public void setAutor(String Autor) {
        this.Autor = Autor;
    }

    public void setNumpag(int Numpag) {
        this.Numpag = Numpag;
    }

    public String getISBN() {
        return ISBN;
    }

    public String getTítulo() {
        return Título;
    }

    public String getAutor() {
        return Autor;
    }

    public int getNumpag() {
        return Numpag;
    }
    
    
    
    

}
