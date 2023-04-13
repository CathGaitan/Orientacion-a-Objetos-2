package ar.edu.unlp.info.oo2.facturacion_llamadas;

import java.util.ArrayList;
import java.util.List;

public abstract class Persoona {
	private List<Llamada> llamadas = new ArrayList<Llamada>();
	private String nombreYApellido;
	private String telefono;
	private String cuit;
	private String documento;
	
	public Persoona(String DNI, String nombre,String telefono){
		this.documento=DNI;
		this.nombreYApellido=nombre;
		this.telefono=telefono;
	}
	
	public void agregarLlamada(Llamada llamada){
		this.llamadas.add(llamada);
	}
	
	public abstract double calcularDescuento(double auxc);
	
	public double calcularPrecioLlamadas(){
		double precio=this.llamadas.stream().mapToDouble(l->l.calcularPrecio()).sum();
		return precio-this.calcularDescuento(precio);
	}
	
	public List<Llamada> getLista1() {
		return llamadas;
	}
	public void setLlamadas(List<Llamada> llamadas) {
		this.llamadas = llamadas;
	}

	public boolean coincideTelefono(String telefono){
		return this.telefono.equals(telefono);
	}
	
	public String getNombreYApellido() {
		return nombreYApellido;
	}
	public void setNombreYApellido(String nya) {
		this.nombreYApellido = nya;
	}
	public String getTelefono() {
		return telefono;
	}
	public void setTelefono(String tel) {
		this.telefono = tel;
	}
	public String getCuit() {
		return cuit;
	}
	public void setCuit(String cuit) {
		this.cuit = cuit;
	}
	public String getDocumento() {
		return documento;
	}
	public void setDocumento(String doc) {
		this.documento = doc;
	}
	

	
}
