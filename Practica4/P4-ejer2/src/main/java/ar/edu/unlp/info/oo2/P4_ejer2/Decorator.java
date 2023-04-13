package ar.edu.unlp.info.oo2.P4_ejer2;

import java.time.LocalDate;

public abstract class Decorator implements Component{
	private Component component;
	
	public Decorator(Component component){
		this.component=component;
	}
	
	public Component getComponent(){
		return this.component;
	}
	
	public String getNombre(){
		return component.getNombre();
	}
	public String getExtension(){
		return component.getExtension();
	}
	public int getTamanio(){
		return component.getTamanio();
	}
	public LocalDate getFechaCreacion(){
		return component.getFechaCreacion();
	}
	public LocalDate getFechaModificacion(){
		return component.getFechaModificacion();
	}
	public String getPermisos(){
		return component.getPermisos();
	}
	
}
