package server;

import java.io.FileInputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class HttpServerMian {
	public static void main(String[] args) throws Exception{
		ServerSocket serverSocket = new ServerSocket(3000);
		while (true) {
			System.out.println("HttpServer 80에서 클라이언트 소켓 요청대기");
			Socket socket = serverSocket.accept();
			OutputStream os = socket.getOutputStream();
			/*
			 * 서버 이미지 리소스 로딩
			 */
			//FileInputStream fis = new FileInputStream("femail.png");
			FileInputStream fis = new FileInputStream("index.html");
			while (true) {
				int readByte = fis.read();
				if(readByte == -1) break;
				os.write(readByte);
			}
			os.flush();
			os.close();
			//socket.close();
		}
		
	}
}
