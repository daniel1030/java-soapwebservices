package ws.soap;

import javax.jws.WebMethod;
import javax.jws.WebService;


@WebService()
public class WsServices {

	@WebMethod()
	public String Hello(){
		
		return "Hello World!!";
	}
	
	
}
