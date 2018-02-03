package client;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.Socket;

public class EchoClientMain {
	public static void main(String[] args) throws Exception{
		/*
		 * 1. Socket 생성
		 */
		Socket socket = new Socket("1.1.1.21", 9999);
		/*
		 * 2. OutputStream 생성
		 */
		OutputStream os = socket.getOutputStream();
		OutputStreamWriter osw = new OutputStreamWriter(os, "UTF-8");
		PrintWriter pw = new PrintWriter(osw);
		/*
		 * 3. OutputStream을 사용하여 데이터 쓰기
		 */
		pw.println("안녕하새오");
		pw.flush();
		
		/*
		 * 4. InputStream 생성
		 */
		BufferedReader br = new BufferedReader(
				new InputStreamReader(
						socket.getInputStream(), "UTF-8"
						)
				);
		
		/*
		 * 5. InputStream으로 서버가 	보낸 데이터 받기
		 */
		String echoLine = br.readLine();
		System.out.println("Client가 읽은 데이터 : " + echoLine);
		
	}
}
