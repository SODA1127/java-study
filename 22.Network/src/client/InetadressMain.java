package client;

import java.net.InetAddress;

public class InetadressMain {
		public static void main(String[] args) throws Exception {
			System.out.println("------------------ remote ip address ------------------");
			InetAddress naverIP = InetAddress.getByName("www.naver.com");
			String address = naverIP.getHostAddress();
			String name = naverIP.getHostName();
			System.out.println("address : " + address + ", name : " + name);
			
			InetAddress[] googleIPs = InetAddress.getAllByName("www.google.com");
			for (int i = 0; i < googleIPs.length; i++) {
				System.out.println(googleIPs[i]);
			}
			
			System.out.println("------ local IP address -------");
			InetAddress localaddress = InetAddress.getLocalHost();
			System.out.println("local host name : " + localaddress.getHostName());
			System.out.println("local host address : " + localaddress.getHostAddress());
			
		}
}
