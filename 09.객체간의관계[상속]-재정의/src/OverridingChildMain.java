
public class OverridingChildMain {

	public static void main(String[] args) {
		/*Overriding o = new Overriding();
		o.method2();*/
		
		OverridingChild oc = new OverridingChild();
		oc.method1();
		/*
		 *  재정의된 메소드가 호출
		 *  	1. 상속받은 메소드는 은폐되어 호출되지 않는다.
		 *  	2. 재정의한 메소드만 호출된다.
		 */
		oc.method2();
		oc.method3();
		
	}

}
