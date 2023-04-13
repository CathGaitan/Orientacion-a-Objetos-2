package ar.edu.unlp.info.oo2.P4_ejer2;

public class Permisos extends Decorator{
	
	public Permisos(Component component){
		super(component);
	}
	public String prettyPrint(){
		return this.getComponent().prettyPrint()+this.getPermisos()+" ";
	}
}
