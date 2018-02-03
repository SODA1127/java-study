package korea.president;

import America.president.Bush;

public class YS {
	public int public_a;
	protected int protected_b;
	int package_c;
	private int private_d;
	
	public void public_method(){
		System.out.println("public_method()");
	}
	
	protected void protected_method() {
		System.out.println("protected_method()");
	}
	
	void package_method(){
		System.out.println("package_method()");
	}
	
	private void private_method(){
		System.out.println("private_method()");
	}
	
	public void access(){
		/*
		 * 같은 패키지
		 */
		DJ dj  = new DJ();
		dj.public_a = 78;
		dj.protected_b = 78;
		dj.package_c = 78;
		//dj.privated_d = 78;
		
		dj.public_method();
		dj.protected_method();
		dj.package_method();
		//dj.privated_method();
		
		
		/*
		 * 다른 패키지
		 */
		Bush bush = new Bush();
		bush.public_method();
		//bush.protected_method();
		//bush.package_method();
		//bush.privated_method();
		
		
	}
	
}
