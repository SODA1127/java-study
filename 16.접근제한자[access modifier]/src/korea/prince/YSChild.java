package korea.prince;
import korea.president.YS;

public class YSChild extends YS{
	public void access(){
		System.out.println("---- 다른 패키지 상속관계(protected) ----");
		this.public_a = 90;
		this.protected_b = 90; //상속받으면 사용가능
		//this.package_c; = 90;
		//this.private_d = 90;
		
		this.public_method();
		this.protected_method();
		//this.package_method();
		//this.private_d();
		
		YS ys = new YS();
		ys.public_a = 90;
//		ys.protected_b = 90;
//		ys..package_c; = 90;
//		ys.private_d = 90;
	}
}
