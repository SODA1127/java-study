
public class OuterClassMain {

	public static void main(String[] args) {
		System.out.println("********************** anonymous local inner classes ************************");
		OuterClass outerClass = new OuterClass();
		OuterClass.InnerClass ic = outerClass.new InnerClass();
		System.out.println("********************** anonymous local inner classes ************************");
		OuterClass outerClass2 = new OuterClass();
		outerClass2.outer_method_익명_로컬_내부_클래스();
	}

}
