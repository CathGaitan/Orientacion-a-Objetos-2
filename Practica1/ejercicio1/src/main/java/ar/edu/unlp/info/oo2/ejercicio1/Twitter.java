package ar.edu.unlp.info.oo2.ejercicio1;

import java.util.List;
import java.util.ArrayList;

public class Twitter {
	private List<Usuario> usuarios;
	
	public Twitter(){
		this.usuarios = new ArrayList<>();
	}
	
	public Usuario crearUsuario(String screenName){
		boolean repetido=this.usuarios.stream()
				.anyMatch(u -> u.getScreenName()
				.equals(screenName));
		if(!repetido){
			Usuario usuario = new Usuario(screenName);
			this.usuarios.add(usuario);
			return usuario;
		}
		return null;
	}
	
	public void eliminarUsuario(String screenName){
		Usuario usuarioEliminar = this.buscarUsuario(screenName);
		if(usuarioEliminar != null){
			usuarioEliminar.eliminarUsuario();
			this.usuarios.remove(usuarioEliminar);
		}
	}
	
	public Usuario buscarUsuario(String screenName){
		return this.usuarios.stream()
		.filter(u -> u.getScreenName()
		.equals(screenName))
		.findFirst().orElse(null);
	}
	
	
	
}
