package coursera.eduardo.netflix;

import java.util.Random;
import java.util.ArrayList;

/**
 * <p> Clase principal ejecutable. </p>
 */
public class App {

	public static void main(String[] args) {

		try {
			ArrayList<Pelicula> peliculas = new ArrayList<>();
			peliculas.add(new Pelicula("Titanic", "Drama", "James Cameron", 1998, 11640));
			peliculas.add(new Pelicula());
			peliculas.add(new Pelicula("El club de la pelea", "Accion", "David Fincher", 1999, 749898));
			peliculas.add(new Pelicula("Dumbo", "Animacion", "Otto Englander", 1942, 23434));
			peliculas.add(new Pelicula("Amores perros", "Guillermo Arriaga"));
			
			ArrayList<Serie> series = new ArrayList<>();
			series.add(new Serie("Game of thrones", 8, "Drama", "David Benioff", 40276));
			series.add(new Serie());
			series.add(new Serie("Anne with an E", 3, "Drama", "Moira Walley-Becket", 7887878));
			series.add(new Serie("Cosmos: a spacetime odyssey", 1, "Science documentary", "Ann Druyan", 89989));
			series.add(new Serie("Sweer tooth", "Evan Moore"));
			
			/* Generador de números aleatorios para elegir como vistas
			   algunas películas y series al azar */
			Random random = new Random();
			
			/* Lista que contendrá las series o películas vistas*/
			ArrayList<Programa> programas = new ArrayList<>();
		
			/* Marcamos como vistas algunas películas al azar y 
			   las metemos a la lista*/
			for (int i = random.nextInt(5); i < 5; i += 1+random.nextInt(5)) {
				peliculas.get(i).marcarVisto();
				programas.add(peliculas.get(i));
			}

			/* Marcamos como vistas algunas series al azar y 
			   las metemos a la lista*/
			for (int i = random.nextInt(5); i < 5; i += 1+random.nextInt(5)) {
				series.get(i).marcarVisto();
				programas.add(series.get(i));
			}
		
			/* Mostramos los programas vistos y un detalle 
			   de los minutos/segundos visualizados */
			for (Programa programa : programas)
				System.out.printf("%s" + "Tiempo visto: %s minutos\n" + "\n", 
							programa.toString(), programa.tiempoVisto());
			
			/* Buscamos la serie con más temporadas */
			Serie masTemporadas = series.get(0);
			for (int i = 1; i < 5; i++) {
				if (series.get(i).getTemporadas() > masTemporadas.getTemporadas())
					masTemporadas = series.get(i);
			}

			/* Buscamos la película más reciente */
			Pelicula masReciente = peliculas.get(0);
			for (int i = 1; i < 5; i++) {
				if (peliculas.get(i).getAño() > masReciente.getAño())
					masReciente = peliculas.get(i);
			}

			/* Mostramos en pantalla la serie con más temporadas
			   y la película de año más reciente, junto con sus detalles */
			System.out.printf("Serie con más temporadas: \n" + "%s\n", masTemporadas.toString());
			System.out.printf("Pelicula más reciente: \n" + "%s\n", masReciente.toString());

		} catch (Exception e) {
			System.out.printf("Excepción ocurrida: %s\n", e.getMessage());
		}
	}
}
