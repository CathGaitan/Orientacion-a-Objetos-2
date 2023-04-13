package ar.edu.unlp.info.oo2.P7_ejer1;

public class EstrategiaLavadoDiario implements EstrategiaLavado{
	
	public void iniciarLavado(Lavarropas lavarropas){
		lavarropas.agregarAgua(50);
		lavarropas.agregarJabonEnPolvo();
		lavarropas.lavar(20);
		lavarropas.vaciarAgua();
		lavarropas.agregarAgua(50);
		lavarropas.agregarEnjuague();
		lavarropas.enjuaga(7);
		lavarropas.centrifugar(3);
	}
	
}
