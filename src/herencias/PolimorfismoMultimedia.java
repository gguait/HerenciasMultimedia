package herencias;

import herencias.Multimedia.format;
import herencias.Multimedia.genero;
import java.util.Scanner;

public class PolimorfismoMultimedia {

    static Scanner teclado = new Scanner(System.in);

    public static void main(String[] args) throws Exception {
        ListaMultimedia listamultimedia = new ListaMultimedia(10);

//        String titulo = null, autor = null, duracion = null, actorPrincipal = null, actrizPrincipal = null;
//        format formato = null;
//        genero genero = null;
        Disco nuevo1 = new Disco("Tha Carter IV", "Lil Wayne", format.mp3, "17 minutos", genero.hiphop);
        Disco nuevo2 = new Disco("To Pimp a Butterfly", "Kendrick Lamar", format.mp3, "18 minutos", genero.hiphop);
        Disco nuevo3 = new Disco("Slipknot", "Slipknot", format.cdAudio, "36 minutos", genero.rock);
        listamultimedia.add(nuevo1);
        listamultimedia.add(nuevo2);
        listamultimedia.add(nuevo3);

        Pelicula nueva1 = new Pelicula("Need for Speed", "Scott Waugh", format.mov, "130 minutos", "Aaron Paul", "Imogen Poots");
        Pelicula nueva2 = new Pelicula("Bob Esponja: la película", "Stephen Hillenburg", format.mov, "87 minutos", "Tom Kenny", "Lori Alan");
        Pelicula nueva3 = new Pelicula("Fast & Furious 4", "Justin Lin", format.mov, "107 minutos", "Vin Diesel", "Michelle Rodriguez");
        listamultimedia.add(nueva1);
        listamultimedia.add(nueva2);
        listamultimedia.add(nueva3);

//      1. Se muestre la lista por pantalla.
        System.out.println(listamultimedia.toString());

//      2. Se calcule la duración total de los objetos de la ListaMultimedia.
//        int tiempoTotal = 0;
//        for (int i = 0; i < listamultimedia.size(); i++) {
//            tiempoTotal += Integer.valueOf(listamultimedia.get(i).getDuracion());
//        }
//        System.out.println(tiempoTotal);

        int contadorSinActriz = 0;
        
        for (int i = 0; i < listamultimedia.size(); i++) {
            if (listamultimedia.get(i) instanceof Pelicula) {
                if (((Pelicula)(listamultimedia.get(i))).getActrizPrincipal().equals("")) {
                    contadorSinActriz++;
                }
            }
        }
        
        System.out.println(contadorSinActriz);

    }
}
