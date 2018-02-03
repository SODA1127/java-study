
public class ParentChildConstructorMain {

	public static void main(String[] args) {
		Child c1 = new Child();
		Child c2 = new Child(1, 2, 3);
		
		c1.print();
		c2.print();
		
		Parent p = new Child(1, 2, 3);
		p.print();
		
	}

}
