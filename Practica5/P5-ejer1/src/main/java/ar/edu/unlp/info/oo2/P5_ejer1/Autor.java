package ar.edu.unlp.info.oo2.P5_ejer1;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Autor {
	private List<Album> albumes;
	private String nombre;
	
	public Autor(String nombre){
		albumes=new ArrayList<>();
		this.nombre=nombre;
	}
	
	public boolean nombreCoincide(String nombre){
		return this.nombre.toLowerCase().contains(nombre.toLowerCase());
	}
	
	public void agregarAlbum(Album album){
		this.albumes.add(album);
	}
	
	public List<Album> getAlbumes(){
		return this.albumes;
	}
	
	public List<Cancion> getTodasLasCanciones(){
		List<Cancion> listaCanciones = new ArrayList<>();
		this.albumes.stream()
			.forEach(a -> listaCanciones.addAll(a.getCanciones()));
		return listaCanciones;
	}
	
	public List<Cancion> buscarPorTitulo(String titulo){
		List<Cancion> listaCanciones = new ArrayList<>();
		this.albumes.stream()
			.forEach(a -> listaCanciones.addAll(a.buscarCanciones(titulo)));
		return listaCanciones;
	}
	
	public List<Cancion> buscarPorAlbum(String titulo){
		List<Cancion> listaCanciones = new ArrayList<>();
		this.albumes.stream()
			.filter(a -> a.nombreCoincide(titulo))
			.forEach(a -> listaCanciones.addAll(a.getCanciones()));
		return listaCanciones;
	}
	
}
