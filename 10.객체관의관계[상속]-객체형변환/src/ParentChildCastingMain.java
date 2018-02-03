/*
 객체의 형변환
   1. 부모자식관계에있는 클래스 틀에서만 가능하다.
   
   2. 자식클래스타입 객체를 부모클래스타입 으로 형변환
       - 자동으로 이루어진다(묵시적)
       Child c = new Child();
       Parent pppp = c; 
   3. 부모 객체를 자식클래스타입으로 형변환
       - 원칙적으로는 불가능하다
       - 부모의 탈을쓴 자식객체 는 가능하다.
       Parent p=new Parent();
       Child cccc = p;(X)
    public class Parent{}
    public class Child extends Parent{}
 */
public class ParentChildCastingMain {

	public static void main(String[] args) {
		System.out.println("-------------1. 부모자식관계에있는 클래스 틀에서만 가능하다.-------------");
		System.out.println();
		Child c1 = new Child();
		
		Parent p1 = c1; //(Parent)c1
		//Parent p2 =new Child();
		//Child c2 = (Child)p2;
		c1.method1();
		c1.method2();
		c1.method3();
		c1.method4();
		/*
		 * 재정의된 메소드 호출시 항상 자식객체의 재정의된 메소드가 호출됨.
		 */
		c1.method99();
		
		p1.method1();
		p1.method2();
		//p1.method3();
		//p1.method4();
		
		p1.method99();
		
		System.out.println("-------------2. 자식클래스타입 객체를 부모클래스타입 으로 형변환-------------");
		Parent p2 = new Parent();
		// 실행시 ClassCastException오류 발생
		//Child c2 = (Child) p2; 
		
		System.out.println("-------------2 - 1. 부모의 탈을쓴 자식객체 는 가능하다.-------------");
		Parent p3 = new Child();
		Child c3 = (Child)p3;
		
		System.out.println(p3);
		System.out.println(c3);
		
		/**********************************/
		/*Object o1 = new Child();
		Object o2 = new Parent();
		
		Object[] oa = new Object[10];
		*/
		}
	}
