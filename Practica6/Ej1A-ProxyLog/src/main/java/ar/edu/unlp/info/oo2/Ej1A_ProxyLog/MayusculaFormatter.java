package ar.edu.unlp.info.oo2.Ej1A_ProxyLog;
import java.util.logging.*;

public class MayusculaFormatter extends SimpleFormatter {
	
	public String format(LogRecord record){
		return super.format(record).toUpperCase();
	}
}
