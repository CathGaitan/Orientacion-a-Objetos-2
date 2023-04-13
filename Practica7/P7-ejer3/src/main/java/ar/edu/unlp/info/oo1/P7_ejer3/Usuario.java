package ar.edu.unlp.info.oo1.P7_ejer3;

import java.util.ArrayList;
import java.util.List;

public class Usuario {
	private List<Proyecto> proyectos=new ArrayList<>();
	private String nombre;
	
	public Usuario(String nombre) {
		this.nombre = nombre;
	}

	public void crearProyecto(String titulo,double montoNecesario){
		Proyecto proyecto = new Proyecto(titulo,this,montoNecesario);
		proyectos.add(proyecto);
	}
	
}
