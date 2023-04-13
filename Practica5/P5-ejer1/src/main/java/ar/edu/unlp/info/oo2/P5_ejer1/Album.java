package ar.edu.unlp.info.oo2.P5_ejer1;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Album {
	private List<Cancion> canciones;
	private String nombre;
	
	public Album(String nombre){
		canciones=new ArrayList<>();
		this.nombre=nombre;
	}
	
	public void agregarCancion(Cancion cancion){
		this.canciones.add(cancion);
	}
	public List<Cancion> getCanciones(){
		return canciones;
	}
	
	
	public List<Cancion> buscarCanciones(String titulo){
		return this.canciones.stream()
				.filter(c -> c.nombreCoincide(titulo))
				.collect(Collectors.toList());
	}
	
	public boolean nombreCoincide(String nombre){
		return this.nombre.toLowerCase().contains(nombre.toLowerCase());
	}
}
