package ar.edu.unlp.info.oo2.P7_ejer1;

public class Lavarropas {
	EstrategiaLavado estrategia=new EstrategiaLavadoDiario();
	
	
	public void cambiarEstrategia(EstrategiaLavado estrategia){
		this.estrategia=estrategia;
	}
	
	public void iniciarLavado(){
		this.estrategia.iniciarLavado(this);
	}
	
	public void agregarAgua(int porcentaje){
		System.out.println("Se agrego "+porcentaje+ "% de agua");
	}
	
	public void agregarJabonEnPolvo(){
		System.out.println("Se agrego jabon en polvo");
	}
	
	public void lavar(int minutos){
		System.out.println("Se lava durante "+minutos+" minutos");
	}
	
	public void vaciarAgua(){
		System.out.println("Se vacio el tambor de agua");
	}
	
	public void agregarEnjuague(){
		System.out.println("Se agrego enguaje");
	}
	
	public void enjuaga(int minutos) {
		System.out.println("Se enjuaga durante "+minutos+" minutos");
	}
	
	public void centrifugar(int minutos){
		System.out.println("Se centrifuga durante "+minutos+" minutos");
	}
}

//en State los estados se conocen entre si, pueden pasarse de uno a otro
//en Strategy las estrategias no se conocen entre si, y se cambian desde afuera
//las estrategias son elegidas por el cliente