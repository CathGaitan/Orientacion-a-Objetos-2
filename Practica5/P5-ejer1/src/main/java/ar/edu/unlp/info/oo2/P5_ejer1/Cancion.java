package ar.edu.unlp.info.oo2.P5_ejer1;

public class Cancion {
	private String nombre;
	
	public Cancion(String nombre){
		this.nombre=nombre;
	}
	
	public boolean nombreCoincide(String titulo){
		return this.nombre.toLowerCase().contains(titulo.toLowerCase());
	}
}
