package ar.edu.unlp.info.oo2.facturacion_llamadas;

public abstract class Llamada {
	private Persoona emisor;
	private Persoona remitente;
	private int duracion;
	
	public Llamada(Persoona emisor, Persoona remitente, int duracion) {
		this.emisor= emisor;
		this.remitente= remitente;
		this.duracion = duracion;
	}
	
	public abstract double calcularPrecio();
	
	public double getDuracion(){
		return this.duracion;
	}

	public void setEmisor(Persoona emisor) {
		this.emisor = emisor;
	}
	public Persoona getRemitente() {
		return this.remitente;
	}
	public void setRemitente(Persoona remitente) {
		this.remitente = remitente;
	}
	
	
	
	
}
