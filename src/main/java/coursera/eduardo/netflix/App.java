package coursera.eduardo.netflix;

import java.util.Random;
import java.util.LinkedList;

public class App {

	public static void main(String[] args) {
		/*Pelicula pelicula = new Pelicula("Titanic", "Drama", "Di Caprio", 1980, 80);
		pelicula.marcarVisto();
		System.out.println(pelicula.tiempoVisto());*/
		Pelicula[] peliculas = {new Pelicula("Titanic", "Drama", "James Cameron", 1998, 11640),
								new Pelicula(), new Pelicula(), new Pelicula(),
								new Pelicula("Amores perros", "Guillermo Arriaga")};
		Serie[] series = {new Serie("titulo", 1, "genero", "creador", 0),
							new Serie(), new Serie(), new Serie(),
							new Serie("titulo", "creador")};
		Random random = new Random();
		LinkedList<Programa> programas = new LinkedList<>();
		for (int i = random.nextInt(5); i < 5; i+= random.nextInt(5)) {
			peliculas[i].marcarVisto();
			programas.add(peliculas[i]);
		}
		for (int i = random.nextInt(5); i < 5; i+= random.nextInt(5)) {
			series[i].marcarVisto();
			programas.add(series[i]);
		}

		for (Programa programa : programas)
			System.out.println(programa.tiempoVisto());
	}
}
