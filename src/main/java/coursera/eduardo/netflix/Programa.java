package coursera.eduardo.netflix;

import java.util.Random;

/**
 * <p> Clase abstracta que generaliza el comportamiento
 * de las clases Serie y pelicula. </p>
 */
abstract class Programa implements Visualizable {
	
	/** El titulo del programa. */
	public String titulo;
	/** El genero del programa. */
	public String genero;
	/** El creador del programa. */
	public String creador;
	/** El estado de visualizacion del programa. */
	public boolean visto;
	/** La duración del programa, en segundos. */
	public double duracion;
   
	/**
	 * Constructor sin parámetros.
	 */
    	public Programa() {}
   
	/**
	 * Construye un programa a partir de su título 
	 * y su creador.
	 * @param titulo el titulo del programa
	 * @param creador el creador del programa
	 */
    	public Programa(String titulo, String creador) {
    		this.titulo = titulo;
    		this.creador = creador;
    	}
   
	/**
	 * Regresa el título del programa.
	 * @return el título del programa.
	 */
    	public String getTitulo() {
        	return titulo;
    	}

	/**
	 * Regresa el genero del programa.
	 * @return el genero del programa.
	 */
    	public String getGenero() {
        	return genero;
    	}

	/**
	 * Regresa el creador del programa.
	 * @return el creador del programa.
	 */
    	public String getCreador() {
        	return creador;
    	}
    
	/**
	 * Regresa la duracion del programa.
	 * @return la duracion del programa.
	 */
    	public double getDuracion() {
    		return duracion;
    	}
   
	/**
	 * Asigna el título dado al programa.
	 * @param titulo el titulo a agregar.
	 */
    	public void setTitulo(String titulo) {
        	this.titulo = titulo;
    	}
    
	/**
	 * Asigna el genero dado al programa.
	 * @param genero el genero a agregar.
	 */
    	public void setGenero(String genero) {
        	this.genero = genero;
    	}

	/**
	 * Asigna el creador dado al programa.
	 * @param creador el creador a agregar.
	 */
    	public void setCreador(String creador) {
        	this.creador = creador;
    	}

	/**
	 * Asigna la duración dada al programa.
	 * @param duracion la duracion a agregar.
	 */
    	public void setDuracion(double duracion) {
        	this.duracion = duracion;
    	}
   
	/**
	 * Marca como visto el programa.
	 */
	@Override public void marcarVisto() {
		visto = true;
	}

	/**
	 * Nos dice si el programa ha sido visto.
	 * @return el estado de visualización del programa.
	 */
	@Override public boolean esVisto() {
		return visto;
	}

	/**
	 * Regresa el tiempo que se ha visto el programa.
	 * @return el tiempo que se ha visto el programa.
	 */
	@Override public String tiempoVisto() {
		return (visto ? calculaTiempo(new Random().nextDouble()*duracion) : "0:00");
	}

	/**
	 * Regresa una representación en cadena del programa.
	 * @return una representación en cadena del programa.
	 */
	@Override abstract public String toString();

	/**
	 * Método privado para convertir tiempo en segundos
	 * a minutos:segundos.
	 * @param tiempo el tiempo a convertir.
	 * @return el tiempo en formato minutos:segundos.
	 */
	private String calculaTiempo(double tiempo) {
		int minutos = 0;
		while (tiempo >= 60.0) {
			minutos++;
			tiempo -= 60.0;
		}
		int restante = (int) tiempo;
		String segundos = restante < 10 ? "0".concat(Integer.toString(restante)) 
								: Integer.toString(restante);
		return String.format("%d:%s", minutos, segundos);
	}
}
