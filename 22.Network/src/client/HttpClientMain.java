package client;

import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.Socket;

public class HttpClientMain {
	public static void main(String[] args) throws Exception{
		Socket socket = new Socket("zum.com", 80);
		
		OutputStream out = socket.getOutputStream();
		InputStream in = socket.getInputStream();
		InputStreamReader isr= new InputStreamReader(in, "UTF-8");
		
		String httpRequest = "GET / HTTP/1.0\r\n\r\n";
		out.write(httpRequest.getBytes());
		out.flush();
		
		while(true){
			int readChar = isr.read();
			if(readChar == -1) break;
			System.out.print((char)readChar);
		}
	}
}
