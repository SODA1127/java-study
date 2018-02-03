
public class OverridingChild extends Overriding{
	/*public void method1(){
		System.out.println("method1()");
	}
	public void method2(){
		System.out.println("method2()");
	}*/
	
	@Override
	public void method2(){
		/*
		 * super :
		 * 		- self참조변수(this와 같은 주소값)
		 * 		- 상속에 의해 은폐된 멤버 접근시 사용
		 */
		super.method2();
		System.out.println("method2()를 추가 재정의");
	}
	public void method3(){
		System.out.println("method3()");
	}
}
