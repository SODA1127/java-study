package Study0921;
/* OOP 의 방법 
 *   1. 캡슐화
 *   2. 상속성
 *   3. 다형성(오버로딩(overloading), 오버라이딩(overriding), 객체형변환(Object Casting))
 *   
 * 1. 캡슐화
 *    - 외부클래스에서 멤버변수에 접근을 막고
 *      멤버 메쏘드에만 접근할수있도록 클래스를 설계하는방법
 *    - 구현 : 멤버변수의 접근제한자를 private
 *				  멤버메소드의 접근제한자는 public으로한다.
 *
 *                public ==> 어떤 외부클래스(객체)에서든지 접근가능
 *                private ==> 어떤 외부클래스(객체)에서든지 접근불가능
 */

public class Encapsulation {
	private int member1;
	private String member2;
	private char member3;
	private double member4;
	
	public void setData(int member1, 
									String member2,
									char member3,
									double member4) {
		//this.member1 = member1;
		setMember1(member1);
		this.member2 = member2;
		this.member3 = member3;
		this.member4 = member4;
		
	}
	
	public int getMember1() {
		return member1;
	}
	public String getMember2() {
		return member2;
	}
	public char getMember3() {
		return member3;
	}
	public double getMember4() {
		return member4;
	}
	
	public void print(){
		System.out.println("member : " + member1 + ", " + member2 + ", " + member3 + ", " + member4);
	}
	
	public void setMember1(int member1) {
		if(member1 < 0){
			System.out.println("number1의 값은 양수여야 합니다.");
		}
		this.member1 = member1;
	}
	public void setMember2(String member2) {
		this.member2 = member2;
	}
	public void setMember3(char member3) {
		this.member3 = member3;
	}
	public void setMember4(double member4) {
		this.member4 = member4;
	}
	
	
/*	public void setMember1(int member1){
		this.member1 = member1;
	}
	public int getMember1(){
		int temp = this.member1;
		return temp; //this 생략
	}*/
	
}
