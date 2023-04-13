package ar.edu.unlp.info.oo2.P4_ejer2;

public class Nombre extends Decorator{

	public Nombre(Component component){
		super(component);
	}
	
	public String prettyPrint(){
		return this.getComponent().prettyPrint()+this.getNombre()+" ";
	}
}
