/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Vehiculos;

/**
 *
 * @author pablo
 */
public class Camion extends Vehiculo{
    protected Remolque remolque;
    
    public Camion(String matricula) {
        super(matricula);
        this.remolque = null;
    }
    
    public void ponRemolque(Remolque remolque) {
        this.remolque = remolque;
    }
    
    public void quitaRemolque() {
        this.remolque = null;
    }

    @Override
    public String toString() {
        return super.toString()+" Camion{" + "remolque=" + remolque + '}';
    }
    
    public void acelerarCamion(int velocidadAcelerar) throws DemasiadoRapidoException{
        if ((super.velocidad + velocidadAcelerar) > 100 && this.remolque != null) {
            throw new DemasiadoRapidoException("No puedes ir tan rapido con un remolque!");
        }
    }
    
}
