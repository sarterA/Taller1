public class Pelicula {

// ATRIBUTO

    private String titol;
    private int duracio;
    private String director;


//CONSTRUCTOR

    public Pelicula(String titol, int duracio, String director) {
        this.titol = titol;
        this.duracio = duracio;
        this.director = director;

    }


// GET

    private String getTitol() {
        return this.titol;
    }
    int getDuracio() {
        return this.duracio;
    }

}
