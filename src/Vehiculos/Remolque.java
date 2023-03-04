/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Vehiculos;

/**
 *
 * @author pablo
 */
public class Remolque {
    private int peso;
    
    // Constructor
    public Remolque(int peso) {
        this.peso = peso;
    }
    
    // Getters y setters

    public double getPeso() {
        return peso;
    }

    
    
    
    public void setPeso(int peso) {
        this.peso = peso;
    }

    @Override
    public String toString() {
        return "Remolque{" + "peso=" + peso + '}';
    }
    
    
}
