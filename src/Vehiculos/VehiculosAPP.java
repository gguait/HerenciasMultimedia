/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Vehiculos;

import java.util.ArrayList;

/**
 *
 * @author pablo
 */
public class VehiculosAPP {

    public static void main(String[] args) throws DemasiadoRapidoException {
        ArrayList<Vehiculo> listaVehiculos = new ArrayList(4);

//    Creamos dos camiones
        Camion camion1 = new Camion("Matricula-camion-1");
        Camion camion2 = new Camion("Matricula-camion-2");

//    Creamos dos coches
        Coche coche1 = new Coche("Matricula-coche-1", 4);
        Coche coche2 = new Coche("Matricula-coche-2", 2);

//    Los añadimos a la lista
        listaVehiculos.add(camion1);
        listaVehiculos.add(camion2);
        listaVehiculos.add(coche1);
        listaVehiculos.add(coche2);

        Remolque nuevoRemolque = new Remolque(5000);

        System.out.println("Acelerando todos los vehiculos en 20kmh");
        for (int i = 0; i < listaVehiculos.size(); i++) {
            if (listaVehiculos.get(i) instanceof Camion) {
                ((Camion) (listaVehiculos.get(i))).ponRemolque(nuevoRemolque);
            }
            listaVehiculos.get(i).acelerar(20);
            System.out.println("Vehiculo " + i + ", " + listaVehiculos.get(i).toString());
        }

    }
}
