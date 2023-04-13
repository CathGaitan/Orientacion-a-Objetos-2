package ar.edu.unlp.info.oo2.P4_ejer2;

public class FechaCreacion extends Decorator{
	
	public FechaCreacion(Component component){
		super(component);
	}
	public String prettyPrint(){
		return this.getComponent().prettyPrint()+this.getFechaCreacion()+" ";
	}
}
