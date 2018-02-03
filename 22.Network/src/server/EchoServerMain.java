package server;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class EchoServerMain {
	public static void main(String[] args) throws Exception{
		ServerSocket serverSocket = new ServerSocket(9999);
		while(true){
			System.out.println("0. Echo serverMain --> 9999번 포트에서 클라이언트 소켓연결 요청 대기");
			Socket socket = serverSocket.accept();
			System.out.println("1. Echo serverMain --> 9999번 포트에서 클라이언트 소켓연결 요청 처리");
			BufferedReader in = new BufferedReader(
					new InputStreamReader(
							socket.getInputStream()));
			
			PrintWriter out =
					new PrintWriter(new OutputStreamWriter(
							socket.getOutputStream()));
			
			System.out.println("3. EchoServerMain --> 클라이언트 소켓으로부터 데이터 읽기");
			String readLine = in.readLine();
			System.out.println(">> 클라이언트로부터 읽은 데이터 : " + readLine);
			
			System.out.println("4. EchoServerMain --> 클라이언트 소켓에 데이터 쓰기");
			out.println("Server --> Client : " + readLine);
			out.flush();
			socket.close();
			
		}
		
	}
}
