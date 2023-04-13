package ar.edu.unlp.info.oo2.Ej1A_ProxyLog;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.logging.*;

public class ProtectionProxy implements DatabaseAccess{
	private String password;
	private boolean logineado;
	private DatabaseAccess delegate;
	private Logger logProxy =Logger.getLogger("proxy");
	
	public ProtectionProxy(String password,DatabaseAccess delegate){
		this.password=password;
		this.delegate=delegate;
		//ArrayList<String> malasPalabras = new ArrayList<>();
		//malasPalabras.add("Acceso");
		//malasPalabras.add("base");
		//HandlerCensurador censurador = new HandlerCensurador(malasPalabras,new ConsoleHandler());
		logProxy.addHandler(new HandlerMail());
		logProxy.setUseParentHandlers(false); 
	}
	
	public void login(String password){
		this.logineado=this.password.equals(password);
	}
	
    public Collection<String> getSearchResults(String queryString) {
    	if(logineado) {
        	logProxy.log(Level.INFO,"Acceso valido para busqueda");
    		return delegate.getSearchResults(queryString);
    	}
    	logProxy.log(Level.SEVERE,"Acceso invalido a base de datos");
    	return Collections.emptyList();
    }
    
    public int insertNewRow(List<String> rowData){
    	if(logineado){
    		logProxy.log(Level.WARNING,"Acceso valido para insercion");
    		return delegate.insertNewRow(rowData);
    	}
    	logProxy.log(Level.SEVERE,"Acceso invalido a base de datos");
    	return 0;
    }

}
