package ar.edu.unlp.info.oo2.P4_ejer2;

public class Tamanio extends Decorator{
	
	public Tamanio(Component component){
		super(component);
	}
	public String prettyPrint(){
		return this.getComponent().prettyPrint()+this.getTamanio()+" ";

	}
}
