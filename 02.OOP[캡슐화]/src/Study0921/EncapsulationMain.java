package Study0921;

public class EncapsulationMain {

	public static void main(String[] args) {
		Encapsulation ec = new Encapsulation();
		/*ec.member1 = 89980;
		ec.member2 = "문자열";
		
		System.out.println(ec.member1);
		System.out.println(ec.member2);*/
		
		ec.setMember1(89980);
		int m1 = ec.getMember1();
		System.out.println(m1);
		
		ec.setData(12, "김경호", 'A', 0.0154);
		m1 = ec.getMember1();
		String m2 = ec.getMember2();
		char m3 = ec.getMember3();
		double m4 = ec.getMember4();
		ec.print();
		System.out.print("m : " + m1 + ", " + m2 + ", " + m3 + ", " + m4);
		
	}

}
