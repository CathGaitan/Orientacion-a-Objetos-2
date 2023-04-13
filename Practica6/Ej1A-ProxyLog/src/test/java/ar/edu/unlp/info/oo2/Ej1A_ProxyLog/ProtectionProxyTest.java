package ar.edu.unlp.info.oo2.Ej1A_ProxyLog;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class ProtectionProxyTest {
	private ProtectionProxy protection;
	private DatabaseRealAccess delegate = new DatabaseRealAccess();
	
    @BeforeEach
    public void setUp(){
        this.protection = new ProtectionProxy("casita41",delegate);
    }
    
    @Test
    public void getSearchResult(){
    	assertEquals(Collections.emptyList(),protection.getSearchResults("select * from comics where id=1"));
    	protection.login("contraseniaMal");
    	assertEquals(Collections.emptyList(),protection.getSearchResults("select * from comics where id=1"));
    	protection.login("casita41");
    	assertEquals(Arrays.asList("Spiderman", "Marvel"),protection.getSearchResults("select * from comics where id=1"));
        assertEquals(Collections.emptyList(), this.protection.getSearchResults("select * from comics where id=10"));
    }
    
    @Test 
    public void testInsertNewRow(){
    	assertEquals(0, this.protection.insertNewRow(Arrays.asList("Miku", "Rin")));
    	protection.login("contraseniaMal");
    	assertEquals(0, this.protection.insertNewRow(Arrays.asList("Miku", "Rin")));
    	protection.login("casita41");
    	assertEquals(3, this.protection.insertNewRow(Arrays.asList("Miku", "Rin")));
    	assertEquals(Arrays.asList("Miku", "Rin"), this.protection.getSearchResults("select * from comics where id=3"));
    }
}
