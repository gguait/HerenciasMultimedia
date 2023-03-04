package Multimedia;

public class Disco extends Multimedia {

    private genero genero;

    public Disco(String titulo, String autor, format formato, String duracion,
            genero genero) throws Exception {
        super(titulo, autor, formato, duracion);
        this.genero = genero;

    }

    public genero getGenero() {
        return genero;
    }

    public void setGenero(genero genero) {
        this.genero = genero;
    }

    @Override
    public String toString() {
        return super.toString() + "\nGenero: " + genero;
    }

}