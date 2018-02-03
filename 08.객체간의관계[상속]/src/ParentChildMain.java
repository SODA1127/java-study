
public class ParentChildMain {
	public static void main(String[] args) {
		Child child1 = new Child();
		
		child1.member1 = 123; //parent
		child1.member2 = "문자열"; //parent
		child1.member3 = 'A'; //child
		
		child1.method1(); //parent
		child1.method2(); //parent
		child1.method3(); //child
		
		System.out.println(child1.getMember1()); //parent
		System.out.println(child1.getMember2()); //parent
		child1.print(); //child
	}
}
