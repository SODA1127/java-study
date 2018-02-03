
public class finalClassMain {

	public static void main(String[] args) {
		FinalClass fc = new FinalClass();
		fc.method1();
		/*fc.INCENTIVE_RATE = 90;
		fc.PORT_NUMBER = 88;
		finalClass.SOUTH = 5;*/
		
		System.out.println(fc.PORT_NUMBER);
		System.out.println(fc.INCENTIVE_RATE);
		System.out.println(FinalClass.SOUTH);
		System.out.println(FinalClass.NORTH);
		System.out.println(FinalClass.EAST);
		System.out.println(FinalClass.WEST);
		
		FinalClassChild fchild = new FinalClassChild();
		fchild.method1();
		fchild.method2();
		fchild.method3();
		System.out.println(fchild.INCENTIVE_RATE);
		System.out.println(fchild.PORT_NUMBER);
		System.out.println("--------------- static context(상속과는 무관) ----------------");
		
		System.out.println(FinalClass.SOUTH);
		System.out.println(FinalClass.NORTH);
		System.out.println(FinalClass.EAST);
		System.out.println(FinalClass.WEST);
		
		System.out.println(FinalClassChild.SOUTH);
		System.out.println(FinalClassChild.NORTH);
		System.out.println(FinalClassChild.EAST);
		System.out.println(FinalClassChild.WEST);
		
		
	}
}
