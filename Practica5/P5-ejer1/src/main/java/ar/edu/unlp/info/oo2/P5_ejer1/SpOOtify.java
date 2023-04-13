package ar.edu.unlp.info.oo2.P5_ejer1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class SpOOtify {
	private List<Autor> autores;
	private List<Usuario> usuarios;
	
	public SpOOtify(){
		autores=new ArrayList<>();
		usuarios=new ArrayList<>();
	}
	
	public void agregarAutor(Autor autor){
		this.autores.add(autor);
	}
	
	public List<Cancion> buscarPorTitulo(String titulo){
		List<Cancion> listaCanciones = new ArrayList<>();
		this.autores.stream()
			.forEach(a -> listaCanciones.addAll(a.buscarPorTitulo(titulo)));
		return listaCanciones;
	}
	
	public List<Cancion> buscarPorAlbum(String titulo){
		List<Cancion> listaCanciones = new ArrayList<>();
		this.autores.stream()
			.forEach(a -> listaCanciones.addAll(a.buscarPorAlbum(titulo)));
		return listaCanciones;
	}
	
	public List<Cancion> buscarPorAutor(String nombre){
		List<Cancion> listaCanciones = new ArrayList<>();
		this.autores.stream()
			.filter(a -> a.nombreCoincide(nombre))
			.forEach(a -> listaCanciones.addAll(a.getTodasLasCanciones()));
		return listaCanciones;
	}
}
