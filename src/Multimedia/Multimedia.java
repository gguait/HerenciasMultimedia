package Multimedia;

import java.util.ArrayList;

public class Multimedia {

    public enum format {
        wav, mp3, midi, avi, mov, mpg, cdAudio, dvd
    }

    public enum genero {
        rock, pop, punk, hiphop, rap
    }

    public String titulo;
    public String autor;
    public format formato;
    public genero genero;
    public String duracion;
    ArrayList<String> titulos;
    ArrayList<String> autores;

    public Multimedia(String titulo, String autor, format formato, String duracion) {
        this.titulo = titulo;
        this.autor = autor;
        this.formato = formato;
        this.duracion = duracion;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getAutor() {
        return autor;
    }

    public format getFormato() {
        return formato;
    }

    public String getDuracion() {
        return duracion;
    }

    public genero getGenero(){
        return genero;
    }
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public void setFormato(format formato) {
        this.formato = formato;
    }

    public void setDuracion(String duracion) {
        this.duracion = duracion;
    }

//    public String multimediaToString() {
//        return "Titulo: " + titulo + "\nAutor: " + autor + "\nFormato: " + formato + "\nDuracion: " + duracion;
//    }

    @Override
    public String toString() {
        return "Titulo=" + titulo + ", autor=" + autor + ", formato=" + formato + ", duracion=" + duracion;
    }

    
    
    // public boolean equals(String titulo, String autor) {
    // boolean primero = false;
    // boolean devolver = false;
    // for (String titulo1 : titulos) {
    // if (titulo == titulo1) {
    // primero = true;
    // }
    // if (primero) {
    // for (String autor1 : autores) {
    // if (autor == autor1) {
    // devolver = true;
    // } else {
    // devolver = false;
    // }
    // }
    // }
    // }
    // return devolver;
    // }

    public boolean equals(Multimedia m) {
        boolean devolver = false;
        if (m.getAutor().equals(autor) && m.getTitulo().equals(titulo)) {
            devolver = true;
        }
        return devolver;
    }

    // public static void main(String[] args) {
    // Multimedia prueba = new Multimedia("titulo", "autor", "formato", "duracion");
    // prueba.multimediaToString();
    // }
}
