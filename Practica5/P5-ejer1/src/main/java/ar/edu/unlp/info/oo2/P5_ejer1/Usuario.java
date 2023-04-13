package ar.edu.unlp.info.oo2.P5_ejer1;

import java.util.ArrayList;
import java.util.List;

public class Usuario {
	private List<Cancion> myMusic;
	
	public Usuario(){
		myMusic=new ArrayList<>();
	}
	
	public void agregarAMyMusic(Cancion cancion){
		this.myMusic.add(cancion);
	}
	
	public void eliminarDeMyMusic(Cancion cancion){
		this.myMusic.remove(cancion);
	}
	
	
}
