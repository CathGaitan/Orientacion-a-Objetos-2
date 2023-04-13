package ar.edu.unlp.info.oo2.P4_ejer2;

public class FechaModificacion extends Decorator{
	
	public FechaModificacion(Component component){
		super(component);
	}
	public String prettyPrint(){
		return this.getComponent().prettyPrint()+this.getFechaModificacion()+" ";
	}
}
