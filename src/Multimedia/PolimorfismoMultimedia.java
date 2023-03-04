package Multimedia;

import Multimedia.Multimedia.format;
import Multimedia.Multimedia.genero;
//import java.util.Scanner;

public class PolimorfismoMultimedia {

//    static Scanner teclado = new Scanner(System.in);
    public static void main(String[] args) throws Exception {
        ListaMultimedia listamultimedia = new ListaMultimedia(10);

        // String titulo = null, autor = null, duracion = null, actorPrincipal = null,
        // actrizPrincipal = null;
        // format formato = null;
        // genero genero = null;
        Disco nuevo1 = new Disco("Tha Carter IV", "Lil Wayne", format.mp3, "17", genero.hiphop);
        Disco nuevo2 = new Disco("To Pimp a Butterfly", "Kendrick Lamar", format.mp3, "18", genero.hiphop);
        Disco nuevo3 = new Disco("Slipknot", "Slipknot", format.cdAudio, "36", genero.rock);
        listamultimedia.add(nuevo1);
        listamultimedia.add(nuevo2);
        listamultimedia.add(nuevo3);

        Pelicula nueva1 = new Pelicula("Need for Speed", "Scott Waugh", format.mov, "130", "Aaron Paul",
                "Imogen Poots");
        Pelicula nueva2 = new Pelicula("Bob Esponja: la película", "Stephen Hillenburg", format.mov, "87",
                "Tom Kenny", "Lori Alan");
        Pelicula nueva3 = new Pelicula("Fast & Furious 4", "Justin Lin", format.mov, "107", "Vin Diesel",
                "Michelle Rodriguez");
        listamultimedia.add(nueva1);
        listamultimedia.add(nueva2);
        listamultimedia.add(nueva3);

        // 1. Se muestre la lista por pantalla.
        System.out.println(listamultimedia.toString());

        // 2. Se calcule la duración total de los objetos de la ListaMultimedia.
        int duracionTotal = 0;

        for (int i = 0; i < listamultimedia.size(); i++) {
            duracionTotal += Integer.parseInt(listamultimedia.get(i).getDuracion());
        }
        System.out.println("La duracion total de los elementos en 'Multimedia' es de " + duracionTotal + " minutos");

        // 3. Se muestre cuántos discos hay de rock.
        int contadorDiscosRock = 0;

        for (int i = 0; i < listamultimedia.size(); i++) {
            if (listamultimedia.get(i) instanceof Disco) {
                if (((Disco) (listamultimedia.get(i))).getGenero().equals(genero.rock)) {
                    contadorDiscosRock++;
                }
            }
        }

        System.out.println("Hay " + contadorDiscosRock + " discos de rock");

        // 4. Se obtenga cuántas películas no tienen actriz principal.
        int contadorSinActriz = 0;

        for (int i = 0; i < listamultimedia.size(); i++) {
            if (listamultimedia.get(i) instanceof Pelicula) {
                if (((Pelicula) (listamultimedia.get(i))).getActrizPrincipal().equals("")) {
                    contadorSinActriz++;
                }
            }
        }

        System.out.println("Hay " + contadorSinActriz + " peliculas sin actriz");
    }
}
