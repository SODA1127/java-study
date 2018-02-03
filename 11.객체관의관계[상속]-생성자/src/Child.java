
public class Child extends Parent {
	public int member3;
	
	public Child(int member1, int member2, int member3) {
		//super(member1, member2);
		super();
		
		//this.member1 = member\1;
		//this.member2 = member2;
		
		setMember1(member1);
		setMember2(member2);
		
		this.member3 = member3;
		
		//getMember1();
		//getMember2();
		
		//System.out.println(member1 + ", " + member2 + ", " + member3);
	}
	public Child(){
		// Constructor call must be the first statement in a constructor
		super(); //Parent 호출 - 생략가능한 코드
		//만약 코드가 있다면 무조건 super()가 우선
		/*
		 * 모든 생성자의 첫 라인에서는 부모클래스의
		 * 기본생성자 호출작업을 합니다.
		 */
		
		System.out.println("child() default생성자");
	}
	public void print() {
		super.print();
		System.out.println(member3);
	}
	
	
}
