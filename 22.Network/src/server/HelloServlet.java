package server;

import java.io.OutputStream;
import java.util.Date;

public class HelloServlet {
	public void service(OutputStream out) throws Exception{
		String sendData = "Hello Servlet " + "[" + new Date().toLocaleString() + "]";
		byte[] sendByteArray = sendData.getBytes();
		out.write(sendByteArray, 0, sendByteArray.length);
	}
}
