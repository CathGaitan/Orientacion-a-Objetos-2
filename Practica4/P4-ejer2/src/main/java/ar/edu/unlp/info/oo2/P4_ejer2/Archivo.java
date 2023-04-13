package ar.edu.unlp.info.oo2.P4_ejer2;
import java.time.LocalDate;

public class Archivo implements Component{
	private String nombre;
	private String extension;
	private int tamanio;
	private LocalDate fechaCreacion;
	private LocalDate fechaModificacion;
	private String permisos;
	
	public Archivo(String nombre,String extension,int tamanio, LocalDate fechaCreacion, LocalDate fechaModifacicacion, String permisos){
		this.nombre=nombre;
		this.extension=extension;
		this.tamanio=tamanio;
		this.fechaCreacion=fechaCreacion;
		this.fechaModificacion=fechaModificacion;
		this.permisos=permisos;
	}
	
	public String prettyPrint(){
		return "";
	}
	
	public String getNombre(){
		return this.nombre;
	}
	
	public String getExtension(){
		return this.extension;
	}
	
	public int getTamanio(){
		return this.tamanio;
	}
	
	public LocalDate getFechaCreacion(){
		return this.fechaCreacion;
	}
	
	public LocalDate getFechaModificacion(){
		return this.fechaModificacion;
	}
	
	public String getPermisos(){
		return this.permisos;
	}
}
