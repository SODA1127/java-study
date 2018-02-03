package korea.prince;

public class SamePackageAccess {
	public void access(){
		YSChild yschild = new YSChild();
		yschild.public_a = 90;
		//yschild.protected_b = 90;
		//yschild.package_c = 90;
		//yschild.private_d = 90;
		
	}
	
}
