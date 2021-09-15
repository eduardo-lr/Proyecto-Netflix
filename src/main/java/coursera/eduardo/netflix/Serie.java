package coursera.eduardo.netflix;

/**
 * <p> Clase para modelar series. </p>
 */
class Serie extends Programa {

	/** El número de temporadas de la serie. */
    public int temporadas;

	/** 
	 * Constructor sin parámetros. 
	 */
    public Serie() {
        temporadas = 1; 
    }

	/**
	 * Construye una serie a partir de
	 * un título y un creador dado.
	 * @param titulo el titulo de la serie.
	 * @param creador el creador de la serie.
	 */
    public Serie(String titulo, String creador) {
        super(titulo, creador);
        this.temporadas = 1;
    }

	/**
	 * Construye una serie a partir de todos
	 * sus atributos dados, salvo el atributo visto.
	 * @param titulo el titulo de la serie.
	 * @param temporadas el número de temporadas de la serie.
	 * @param genero el genero de la serie.
	 * @param creador el creador de la serie.
	 * @param duracion la duración de la serie, en segundos.
	 */
    public Serie(String titulo, int temporadas, String genero, 
                                String creador, double duracion) {
        this.titulo = titulo;
        this.temporadas = temporadas;
        this.genero = genero;
        this.creador = creador;
        this.duracion = duracion;
    }

	/**
	 * Regresa el número de temporadas de la serie.
	 * @return el número de temporadas de la serie.
	 */
    public int getTemporadas() {
        return temporadas;
    }

	/**
	 * Asigna a la serie el número de temporadas dado.
	 * @param temporadas el número de temporadas a agregar.
	 */
    public void setTemporadas(int temporadas) {
        this.temporadas = temporadas;
    }

	/**
	 * Regresa una representación en cadena de la serie.
	 * @return una representación en cadena de la serie.
	 */
    @Override public String toString() {
		return (String.format("Titulo               : %s\n" +
                              "No. de temporadas    : %d\n" +
                              "Visto                : %s\n" +
                              "Genero               : %s\n" + 
							  "Creador              : %s\n" +
							  "Duracion             : %.3f\n",
                              titulo, temporadas, (visto ? "Sí" : "No"), 
														genero, creador, duracion));
	}
}
