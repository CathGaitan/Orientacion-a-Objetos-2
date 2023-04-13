package ar.edu.unlp.info.oo2.Ej1A_ProxyLog;
import java.util.logging.*;
import org.json.*;

public class JSONFormatter extends Formatter{
	
	public String format(LogRecord record){
        JSONObject logJSON = new JSONObject();
        logJSON.put("message",record.getMessage());
        logJSON.put("level",record.getLevel());
		return logJSON.toString()+"\n";
	}

}
