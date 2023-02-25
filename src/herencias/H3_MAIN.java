/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package herencias;

import herencias.Multimedia.format;
import java.util.Scanner;

/**
 *
 * @author pabmar
 */
public class H3_MAIN {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Que quieres agregar");

        int eleccion = -1;
        int formatoEleccion = -1;
        System.out.println("1. Pelicula\n2. Disco\n3. Salir");
        eleccion = teclado.nextInt();
        // String titulo, String autor, format formato, String duracion, String
        // actorPrincipal, String actrizPrincipal)
        switch (eleccion) {
            case 1:
                String titulo, autor, duracion, actorPrincipal, actrizPrincipal;
                format formato = null;
                teclado.nextLine();

                System.out.println("Titulo: ");
                titulo = teclado.nextLine();

                System.out.println("Autor: ");
                autor = teclado.nextLine();

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

                teclado.nextLine();
                System.out.println("Duracion: ");
                duracion = teclado.nextLine();

                System.out.println("Actor Principal: ");
                actorPrincipal = teclado.nextLine();

                System.out.println("Actriz Principal: ");
                actrizPrincipal = teclado.nextLine();

                System.out.println();

                // public Pelicula(String titulo, String autor, format formato, String duracion,
                // String actorPrincipal, String actrizPrincipal)

            case 2:
                // public Disco(String titulo, String autor, format formato, String duracion,
                // String genero)
        }
    }
}
