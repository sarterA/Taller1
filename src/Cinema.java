import java.util.ArrayList;

public class Cinema {
//atributos
    private String nom;
    private int sales;
    private Pelicula [] peliculas; //array atributo


    //constructor
    public Cinema(String nom, int sales, Pelicula [] peliculas) {
        this.nom = nom;
        this.sales = sales;
        this.peliculas = peliculas;  //constructor array atributo

    }

//ARRAY usando get y parametros

    public Pelicula peliculaMesLlarga(){
        int duracio = 0;

        Pelicula pelicula = new Pelicula("",0,"");
        for (int i = 0; i < this.peliculas.length; i++) {
            if (this.peliculas[i].getDuracio() > duracio) {

                duracio = this.peliculas[i].getDuracio();
                pelicula = this.peliculas[i];
            }
        }
        return pelicula;

    }
}
