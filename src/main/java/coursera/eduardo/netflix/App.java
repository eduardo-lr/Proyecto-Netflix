package coursera.eduardo.netflix;

import java.util.Random;
import java.util.LinkedList;

public class App {

	public static void main(String[] args) {
		Pelicula[] peliculas = {new Pelicula("Titanic", "Drama", "James Cameron", 1998, 11640),
								new Pelicula(),
								new Pelicula("El club de la pelea", "Accion", "David Fincher", 1999, 749898),
								new Pelicula("Dumbo", "Animacion", "Otto Englander", 1942, 23434),
								new Pelicula("Amores perros", "Guillermo Arriaga")};

		Serie[] series = {new Serie("Game of thrones", 8, "Drama", "David Benioff", 40276),
						  new Serie(),
						  new Serie("Anne with an E", 3, "Drama", "Moira Walley-Becket", 7887878),
						  new Serie("Cosmos: a spacetime odyssey", 1, "Science documentary", "Ann Druyan", 89989),
						  new Serie("Sweer tooth", "Evan Moore")};
		
		/* Generador de números aleatorios para elegir como vistas
		   algunas películas y series al azar */
		Random random = new Random();
		
		/* Lista que contendrá las series o películas vistas*/
		LinkedList<Programa> programas = new LinkedList<>();
	
		/* Marcamos como vistas algunas películas al azar y 
		   las metemos a la lista*/
		for (int i = random.nextInt(5); i < 5; i += 1+random.nextInt(5)) {
			peliculas[i].marcarVisto();
			programas.add(peliculas[i]);
		}

		/* Marcamos como vistas algunas series al azar y 
		   las metemos a la lista*/
		for (int i = random.nextInt(5); i < 5; i += 1+random.nextInt(5)) {
			series[i].marcarVisto();
			programas.add(series[i]);
		}
	
		/* Mostramos los programas vistos y un detalle 
		   de los minutos/segundos visualizados */
		for (Programa programa : programas)
			System.out.printf("%s" + 
							  "Tiempo visto: %s minutos\n" + "\n", 
							  	programa.toString(), programa.tiempoVisto());
		
		/* Buscamos la serie con más temporadas */
		Serie masTemporadas = series[0];
		for (int i = 1; i < 5; i++) {
			if (series[i].getTemporadas() > masTemporadas.getTemporadas())
				masTemporadas = series[i];
		}

		/* Buscamos la película más reciente */
		Pelicula masReciente = peliculas[0];
		for (int i = 1; i < 5; i++) {
			if (peliculas[i].getAño() > masReciente.getAño())
				masReciente = peliculas[i];
		}

		/* Mostramos en pantalla la serie con más temporadas
		   y la película de año más reciente, junto con sus detalles */
		System.out.printf("Serie con más temporadas: \n" + "%s\n", masTemporadas.toString());
		System.out.printf("Pelicula más reciente: \n" + "%s\n", masReciente.toString());
	}
}
