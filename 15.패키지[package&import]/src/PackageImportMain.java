import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.sql.DriverManager;

import com.itwill.shop.member.Member;
import com.itwill.shop.member.MemberManager;
//import com.itwill.shop.member.*;

import com.itwill.shop.order.Order;
import com.itwill.shop.order.OrderManager;
import com.itwill.shop.product.Product;
import com.itwill.shop.product.ProductManager;
/*
 * ctrl+shift+o : �ڵ� import  
 * ctrl+shift+m
 * 
 */
public class PackageImportMain {

	public static void main(String[] args) {
		
		Member m1=new Member();
		MemberManager mm1=new MemberManager();
		
		System.out.println(m1);
		System.out.println(mm1);
		
		Order o=new Order();
		OrderManager om=new OrderManager();
		System.out.println(o);
		System.out.println(om);
		
		Product sp=new Product();
		ProductManager spm=new ProductManager();
		System.out.println(sp);
		System.out.println(spm);
		
		com.itwill.shop.admin.Product ap=
				new com.itwill.shop.admin.Product();
		com.itwill.shop.admin.ProductManager apm=
				new com.itwill.shop.admin.ProductManager();
		System.out.println(ap);
		System.out.println(apm);
		
		System.out.println("------------java.lang package---------");
		/*
		 * java.lang package�� import ������������
		 */
		java.lang.String  str1="�ڹ�lang��Ű��";
		String  str2="�ڹ�lang��Ű��";
		System.gc();
		int r=Math.abs(-990);
		
		System.out.println("------------java ǥ�� package---------");
		InputStream in;
		OutputStream out;
		Socket socket;
		DriverManager dm;
		
		
		
		
		
		
		
		
		
		
	}

}
