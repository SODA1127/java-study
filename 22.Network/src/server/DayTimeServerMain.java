package server;

import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DayTimeServerMain {

	public static void main(String[] args) throws Exception{
		ServerSocket serverSocket = new ServerSocket(8000);
		
		while(true){
			System.out.println("0. DayTimeServerMain --> 8000번 포트에서 클라이언트 소켓 연결 요청 대기");
			Socket socket = serverSocket.accept();
			System.out.println("1. DayTimeServerMain --> 8000번 포트에서 클라이언트 소켓 연결 요청 처리" + socket);
			PrintWriter out =
					new PrintWriter(
							new OutputStreamWriter(
									socket.getOutputStream()));
			System.out.println("2. DayTimeServerMain --> 클라이언트 소켓에 시간 쓰기");
			Date now = new Date();
			SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
			String serverTime = sdf.format(now);
			
			out.println(serverTime);
			out.flush();
			socket.close();
			
		}
	}

}
