package ar.edu.unlp.info.oo2.P4_ejer1;

import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class ProtectionProxy implements DatabaseAccess{
	private String password;
	private boolean logineado;
	private DatabaseAccess delegate;
	
	public ProtectionProxy(String password,DatabaseAccess delegate){
		this.password=password;
		this.delegate=delegate;
	}
	
	public void login(String password){
		this.logineado=this.password.equals(password);
	}
	
    public Collection<String> getSearchResults(String queryString) {
    	if(logineado) return delegate.getSearchResults(queryString);
    	return Collections.emptyList();
    }
    
    public int insertNewRow(List<String> rowData){
    	if(logineado) return delegate.insertNewRow(rowData);
    	return 0;
    }

}
