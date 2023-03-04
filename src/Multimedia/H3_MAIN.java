package Multimedia;

import Multimedia.Multimedia.format;
import Multimedia.Multimedia.genero;
import java.util.Scanner;

public class H3_MAIN {
    static Scanner teclado = new Scanner(System.in);
    static String titulo, autor, duracion;

    private static void pedirDatos() {
        int formatoEleccion = -1;
        format formato = null;

        System.out.println("Titulo: ");
        titulo = teclado.nextLine();

        System.out.println("Autor: ");
        autor = teclado.nextLine();

        System.out.println("Duracion: ");
        duracion = teclado.nextLine();

        System.out.println(
                "Formato:\n1. Wav,\n2. mp3,\n3. midi,\n4. avi,\n5. mov,\n6. mpg,\n7. cdAudio,\n8. dvd");
        formatoEleccion = teclado.nextInt();

        // wav, mp3, midi, avi, mov, mpg, cdAudio, dvd
        switch (formatoEleccion) {
            case 1:
                formato = format.wav;
            case 2:
                formato = format.mp3;
            case 3:
                formato = format.midi;
            case 4:
                formato = format.avi;
            case 5:
                formato = format.mov;
            case 6:
                formato = format.mpg;
            case 7:
                formato = format.cdAudio;
            case 8:
                formato = format.dvd;
        }
    }

    public static void main(String[] args) throws Exception {
        System.out.println("Que quieres agregar");

        int eleccion = -1;
        System.out.println("1. Pelicula\n2. Disco\n3. Salir");
        eleccion = teclado.nextInt();
        format formato = null;
        // String titulo, String autor, format formato, String duracion, String
        // actorPrincipal, String actrizPrincipal)
        switch (eleccion) {
            case 1:
                pedirDatos();

                String actorPrincipal, actrizPrincipal;
                teclado.nextLine();

                System.out.println("Actor Principal: ");
                actorPrincipal = teclado.nextLine();

                System.out.println("Actriz Principal: ");
                actrizPrincipal = teclado.nextLine();

                System.out.println();

                Pelicula nueva = new Pelicula(titulo, autor, formato, duracion, actorPrincipal, actrizPrincipal);

            case 2:
                pedirDatos();

                genero genero = null;
                teclado.nextLine();

                System.out.println("Actor Principal: ");
                actorPrincipal = teclado.nextLine();

                System.out.println("Actriz Principal: ");
                actrizPrincipal = teclado.nextLine();

                System.out.println();

                Disco nuevo = new Disco(titulo, autor, formato, duracion, genero);

        }
    }
}
