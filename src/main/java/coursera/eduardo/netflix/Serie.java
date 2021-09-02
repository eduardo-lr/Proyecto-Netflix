package coursera.eduardo.netflix;

class Serie extends Programa {

    public int temporadas;

    public Serie() {
        temporadas = 1; 
    }

    public Serie(String titulo, String creador) {
        super(titulo, creador);
        this.temporadas = 1;
    }

    public Serie(String titulo, int temporadas, String genero, 
                                String creador, double duracion) {
        this.titulo = titulo;
        this.temporadas = temporadas;
        this.genero = genero;
        this.creador = creador;
        this.duracion = duracion;
    }

    public int getTemporadas() {
        return temporadas;
    }

    public void setTemporadas(int temporadas) {
        this.temporadas = temporadas;
    }

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
