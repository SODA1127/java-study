
public class Child extends Parent{
	
	public char member3;
	public void method3(){
		System.out.println("method3()");
	}
	public void print(){
		System.out.println(this.member1 + "\t" + this.member2 + "\t" + this.member3);
	}
}
