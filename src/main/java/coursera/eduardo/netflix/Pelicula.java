package coursera.eduardo.netflix;

class Pelicula extends Programa {

	public int año;

	public Pelicula() {}

	public Pelicula(String titulo, String creador) {
		super(titulo, creador);
	}

	public Pelicula(String titulo, String genero, 
						String creador, int año, double duracion) {
		this.titulo = titulo;
		this.genero = genero;
		this.creador = creador;
		this.año = año;
		this.duracion = duracion;
	}
	
	public int getAño() {
		return año;
	}

	public void setAño(int año) {
		this.año = año;
	}

	@Override public String toString() {
		return (String.format("Titulo    : %s\n" +
                              "Genero    : %s\n" +
                              "Creador   : %s\n" +
                              "Año       : %d\n" + 
							  "Duración  : %.3f\n" +
							  "Visto     : %s\n",
                              this.titulo, this.genero, this.creador, this.año, 
                              	this.duracion, (this.visto ? "Verdadero" : "Falso")));
	}
}
