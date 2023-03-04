/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Vehiculos;

/**
 *
 * @author pablo
 */
public class Coche extends Vehiculo{
    protected int numPuertas;
    
    public Coche(String matricula, int numPuertas) {
        super(matricula);
        this.numPuertas = numPuertas;
    }

    public int getNumPuertas() {
        return numPuertas;
    }

    public void setNumPuertas(int numPuertas) {
        this.numPuertas = numPuertas;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public int getVelocidad() {
        return velocidad;
    }

    public void setVelocidad(int velocidad) {
        this.velocidad = velocidad;
    }
    
    public void cantidadPuertas(Coche coche){
        System.out.println("El coche en cuestión tiene "+coche.getNumPuertas()+" ");
    }

    @Override
    public String toString() {
        return super.toString()+" Coche{" + "numPuertas=" + numPuertas + '}';
    }
    
    
}
