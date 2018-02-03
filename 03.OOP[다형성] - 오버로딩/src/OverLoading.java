/*
오버로딩(다중정의)
  1. 자바 다형성구현기법 중의하나이다.
  2. 정의: 같은메쏘드 이름으로 여러개를 정의하는방법
           - 규칙: 
               * 메쏘드의 이름이 같아야한다.
               * 메쏘드의 인자의 숫자가 다르거나
               * 메쏘드의 인자의 타입이 달라야한다.
*/

public class OverLoading {
	public void method(){
		System.out.println("public void method()");
	}
	public void method(int a){
		System.out.println("public void method(int a)");
	}
	public void method(int a, int b){
		System.out.println("public void method(int a, int b)");
	}
	public void method(String a, String b){
		System.out.println("public void method(String a, String b)");
	}
	public void method(int a, String b){
		System.out.println("public void method(int a, String b)");
	}
	/*
	 * 메쏘드의 리턴타입,접근지정자는 상관없다.
	 * public int method(int a, String b){
		System.out.println("public void method(int a, String b)");
		return 0;
	}*/
}
