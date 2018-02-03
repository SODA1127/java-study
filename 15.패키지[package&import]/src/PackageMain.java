
public class PackageMain {

	public static void main(String[] args) {
		
		com.itwill.shop.member.Member m1=
				new com.itwill.shop.member.Member();
		
		System.out.println(m1);
		
		com.itwill.shop.member.MemberManager mm1=
				new com.itwill.shop.member.MemberManager();
		System.out.println(mm1);
		
		
		com.itwill.shop.product.Product p=
				new com.itwill.shop.product.Product();
		System.out.println(p);
		com.itwill.shop.product.ProductManager pm=
				new com.itwill.shop.product.ProductManager();
		System.out.println(pm);
		
		
		com.itwill.shop.admin.Product ap=
				new com.itwill.shop.admin.Product();
		System.out.println(ap);
		com.itwill.shop.admin.ProductManager apm=
				new com.itwill.shop.admin.ProductManager();
		System.out.println(apm);
		
		
		

	}

}
