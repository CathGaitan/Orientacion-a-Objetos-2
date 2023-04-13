package ar.edu.unlp.info.oo2.ejercicio2;
import java.util.ArrayList;
import java.util.List;
import org.json.simple.*;

public class JSONSimpleAdaptee{
	private JSONArray JSONArray = new JSONArray();
	
	private void exportar(Socio socio){
		JSONObject JSON = new JSONObject();
		JSON.put("nombre", socio.getNombre());
		JSON.put("email", socio.getEmail());
		JSON.put("legajo", socio.getLegajo());
		JSONArray.add(JSON);
	}
	
	public String exportar(List<Socio> socios){
		if(socios.isEmpty()) return "[]";
		socios.stream().forEach(socio -> this.exportar(socio));
		return JSONArray.toJSONString();
	}
	
/*
	public static void main(String[] args){
		 List<Socio> lista = new ArrayList<>();
		 JSONSimpleAdaptee adapter = new JSONSimpleAdaptee();
		 lista.add(new Socio("Arya Stark", "needle@stark.com", "5234-5"));
		 lista.add(new Socio("Tyron Lannister", "tyron@thelannisters.com",  "2345-2"));
		 System.out.print(adapter.exportar(lista));
	 }
*/
}
