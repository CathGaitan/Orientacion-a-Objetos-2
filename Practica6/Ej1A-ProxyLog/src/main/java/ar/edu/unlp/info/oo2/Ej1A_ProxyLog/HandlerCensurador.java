package ar.edu.unlp.info.oo2.Ej1A_ProxyLog;

import java.util.ArrayList;
import java.util.logging.*;

public class HandlerCensurador extends Handler{
	private ArrayList<String> censurar;
	private Handler handler;
	
	public HandlerCensurador(ArrayList<String> censurar,Handler handlerExistente){
		this.censurar=censurar;
		this.handler=handlerExistente;
	}

	
	@Override
	public void publish(LogRecord record) {
		String mensaje=record.getMessage();
		for(String palabra:censurar){
			mensaje=mensaje.replace(palabra,"***");
		}
		record.setMessage(mensaje);		
	}

	@Override
	public void flush() {
		handler.flush();
		
	}

	@Override
	public void close() throws SecurityException {
		handler.close();
	}

	
	
	
	
}
