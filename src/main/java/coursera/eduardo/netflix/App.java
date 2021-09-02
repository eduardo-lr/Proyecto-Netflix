package coursera.eduardo.netflix;

public class App {

	public static void main(String[] args) {
		Pelicula pelicula = new Pelicula("Titanic", "Drama", "Di Caprio", 1980, 80);
		pelicula.marcarVisto();
		System.out.println(pelicula.tiempoVisto());
	}
}
