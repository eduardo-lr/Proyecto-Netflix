package coursera.eduardo.netflix;

/**
 * <P> Clase para modelar películas. </p>
 */
class Pelicula extends Programa {

	/** El año de la película. */
	public int año;

	/** 
	 * Constructor sin parámetros. 
	 */
	public Pelicula() {}

	/** 
	 * Construye una película a partir de
	 * un título y un creador dado.
	 * @param titulo el titulo de la película.
	 * @param creador el creador de la serie.
	 */
	public Pelicula(String titulo, String creador) {
		super(titulo, creador);
	}

	/** 
	 * Construye una película a partir de todos
	 * sus atributos dados, salvo el atributo visto.
	 * @param titulo el título de la película.
	 * @param genero el genero de la película.
	 * @param creador el creador de la película.
	 * @param año el año de la película.
	 * @param duración la duración de la película, en segundos.
	 */
	public Pelicula(String titulo, String genero, 
				String creador, int año, double duracion) {
		this.titulo = titulo;
		this.genero = genero;
		this.creador = creador;
		this.año = año;
		this.duracion = duracion;
	}

	/**
	 * Regresa el año de la película.
	 * @return el año de la película.
	 */
	public int getAño() {
		return año;
	}

	/**
	 * Asigna el año dado a la película.
	 * @param año el año a agregar.
	 */
	public void setAño(int año) {
		this.año = año;
	}

	/**
	 * Regresa una representación en cadena de la película.
	 * @return una representación en cadena de la película.
	 */
	@Override public String toString() {
		return (String.format("Titulo    : %s\n" +
                              	      "Genero    : %s\n" +
                              	      "Creador   : %s\n" +
                              	      "Año       : %d\n" + 
				      "Duración  : %.3f\n" +
				      "Visto     : %s\n",
                              			titulo, genero, creador, año, 
							duracion, (visto ? "Sí" : "No")));
	}
}
