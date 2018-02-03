public class ConstructorMain {

	public static void main(String[] args) {
		System.out.println("1. ------------Constructor()-----------");
		Constructor c1 = new Constructor();
		System.out.println("c1 : " + c1);
		Constructor c2 = new Constructor();
		System.out.println("c2 : " + c2);
		c2.print();
		System.out.println();
		
		System.out.println("2. -----------Constructor(int member1)------------");
		Constructor c3 = new Constructor(8888);
		c3.print();
		System.out.println();
		
		System.out.println("3. -----------Constructor(5개)------------");
		Constructor c4 = new Constructor(9999, 4.5, '김', false, "쉬세요");
		c4.print();
		System.out.println();
		

		System.out.println("4. -----------Default Constructor ------------");
		DefaultConstructor dc = new DefaultConstructor();
		System.out.println("DefaultConstructor : " + dc.toString());
	}

}
