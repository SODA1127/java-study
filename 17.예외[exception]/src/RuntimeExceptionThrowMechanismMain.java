
public class RuntimeExceptionThrowMechanismMain {

	public static void main(String[] args) throws RuntimeException, ArithmeticException{
		System.out.println("stmt1");
		String str = null;
		/*
		 * NullPointerException
		 */
		//int length = str.length();
		System.out.println("stmt2");
		//int r = 3/0;
		System.out.println("stmt3");
		int[] ia = new int[3];
		/*
		 * ArrayIndexOutOfBoundsException
		 */
		ia[3] = 90;
		
	}

}
