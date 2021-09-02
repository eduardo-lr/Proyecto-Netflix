package coursera.eduardo.netflix;

import java.util.Random;

class Programa implements Visualizable {
	
	public String titulo;
	public String genero;
	public String creador;
	public boolean visto;
	public double duracion; // en segundos.
    
    public Programa() {}
    
    public Programa(String titulo, String creador) {
    	this.titulo = titulo;
    	this.creador = creador;
    }
    
    public String getTitulo() {
        return titulo;
    }

    public String getGenero() {
        return genero;
    }

    public String getCreador() {
        return creador;
    }
    
    public double getDuracion() {
    	return duracion;
    }
    
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
    
    public void setGenero(String genero) {
        this.genero = genero;
    }

    public void setCreador(String creador) {
        this.creador = creador;
    }

    public void setDuracion(double duracion) {
        this.duracion = duracion;
    }
    
	@Override public void marcarVisto() {
		visto = true;
	}

	@Override public boolean esVisto() {
		return visto;
	}

	@Override public String tiempoVisto() {
		return (visto ? calculaTiempo(new Random().nextDouble()*duracion) : "0:00");
	}
	
	private String calculaTiempo(double tiempo) {
		int minutos = 0;
		while (tiempo >= 60.0) {
			minutos++;
			tiempo -= 60.0;
		}
		int remaind = (int) tiempo;
		String segundos = remaind < 10 ? "0".concat(Integer.toString(remaind)) : 
												Integer.toString(remaind);
		return String.format("%d:%s", minutos, segundos);
	}
}
