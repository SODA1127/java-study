package korea.president;

public class DJ {
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
}
