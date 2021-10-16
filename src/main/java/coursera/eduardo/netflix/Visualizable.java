package coursera.eduardo.netflix;

/**
 * <p> Interfaz para modelar el comportamiento
 * de un programa visualizable. </p>
 */
interface Visualizable {

	/**
	 * Marca en visto el visualizable.
	 */
	public void marcarVisto();

	/**
	 * Regresa el estado de visualización.
	 * @return el estado de visualización.
	 */
    	public boolean esVisto();

	/**
	 * Regresa el tiempo que ha sido visto el visualizable.
	 * @return el tiempo que ha sido visto el visualizable.
	 */
    	public String tiempoVisto();
}
