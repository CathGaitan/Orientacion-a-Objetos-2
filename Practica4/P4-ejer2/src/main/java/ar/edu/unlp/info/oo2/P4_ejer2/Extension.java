package ar.edu.unlp.info.oo2.P4_ejer2;

public class Extension extends Decorator{
	
	public Extension(Component component){
		super(component);
	}
	public String prettyPrint(){
		return this.getComponent().prettyPrint()+this.getExtension()+" ";

	}
}
