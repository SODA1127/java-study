
public class AbstractClassMain {

	public static void main(String[] args) {
		/*
		 * 	추상 클래스는 객체생성이 안됨
		 * Cannot instantiate the type AbstractClass
		 */
		//AbstractClass ac1 = new AbstractClass();
		
		/*
		 * 추상클래스는 추상클래스를 상속받아서 추상메쏘드를 
		 * 구현(오버라이딩)하는 자식 클래스를 만들어 
		 * 사용(객체생성)해야한다 
		 */
		
		AbstractClassChild achild1 = new AbstractClassChild();
		achild1.method1();
		achild1.method2();
	}

}
