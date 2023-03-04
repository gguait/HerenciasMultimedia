/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Vehiculos;

/**
 *
 * @author pablo
 */
public class Vehiculo {
    protected String matricula;
    protected int velocidad;

    public Vehiculo(String matricula) {
        this.matricula = matricula;
        this.velocidad = 0;
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

    @Override
    public String toString() {
        return "Vehiculo{" + "matricula=" + matricula + ", velocidad=" + velocidad + '}';
    }
        
    public void acelerar(int velocidadAcelerar){
        this.velocidad = velocidadAcelerar;
    }
}
