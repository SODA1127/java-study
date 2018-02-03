/*
 * 상속(클래스의 관계):
 * 	부모클래스(객체)의 멤버들을 자식클래스(객체)가 물려받는것
 * 
 *  1. 상속을 사용하는 이유--> 기존에 만들어놓은 클래스의 재사용, 확장을위해 사용한다.
 *  2. 자바에서는 단일상속만이 가능하다(부모클래스가 한개만 가능) 
 *  3. 부모클래스(super)와 자식클래스(sub)가존재한다.
 *  4. 자바에서 제공되어지는 모든 클래스들은 Object 라고하는
 *     최상위 클래스로부터 상속되어진다.
 *  5. 사용자정의 클래스들도 Object 클래스라는 최상위클래스를
 *     상속  받아야한다. 
 * 
 */
public class Parent extends Object{
	public int member1;
	public String member2;
	
	public void method1(){
		System.out.println("method1()");
	}
	
	public void method2(){
		System.out.println("method2()");
	}

	public int getMember1() {
		return member1;
	}

	public String getMember2() {
		return member2;
	}

	public void setMember1(int member1) {
		this.member1 = member1;
	}

	public void setMember2(String member2) {
		this.member2 = member2;
	}
	
	
}
