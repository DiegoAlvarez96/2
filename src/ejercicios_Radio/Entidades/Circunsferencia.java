/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicios_Radio.Entidades;

/**
 *
 * @author Usuario
 */
public class Circunsferencia {
    
    private Double radio;


    public Circunsferencia(Double radio) {
        this.radio = radio;
    }
    
    public Double getRadio() {
        return radio;
    }

    public void setRadio(Double radio) {
        this.radio = radio;
    }

    @Override
    public String toString() {
        return "Circunsferencia{" + "radio=" + radio + '}';
    }
    
    
    
    
    
    
}
