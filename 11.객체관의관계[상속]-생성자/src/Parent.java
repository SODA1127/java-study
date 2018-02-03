
public class Parent {  //extends Object{
	private int member1;
	private int member2;
	
	public Parent(){
		System.out.println("Parent() default생성자");
	}
	
	public Parent(int member1, int member2) {
		super();
		this.member1 = member1;
		this.member2 = member2;
	}
	public void print() {
		System.out.print(member1 + "\t" + member2 + "\t");
	}
	
	public int getMember1() {
		return member1;
	}
	public int getMember2() {
		return member2;
	}
	public void setMember1(int member1) {
		this.member1 = member1;
	}
	public void setMember2(int member2) {
		this.member2 = member2;
	}
	
}
