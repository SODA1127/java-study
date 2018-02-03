package Study0914;

public class ArithmaticOperator {

	public static void main(String[] args) {
		int a = 1;
		int b = 2;
		int result;
		
		result  = a + b;
		System.out.println(result);
		result  = a - b;
		System.out.println(result);
		result  = a * b;
		System.out.println(result);
		result  = a / b;
		System.out.println("integer : " + result);
		double dresult  = a/b;
		System.out.println("double : " + dresult);
		
		System.out.println("----------------%-----------------");
		result  = a % b;
		System.out.println("a%b = " + result);
		int number = 45;
		result = number%2;
		System.out.println("n&2 = " + result);
		result = number%3;
		System.out.println("n&3 = " + result);
		result = number%4;
		System.out.println("n&4 = " + result);
		result = number%5;
		System.out.println("n&5 = " + result);
		
		System.out.println("----------------<<-----------------");
		int c = 1;
		System.out.println(c);
		result = c << 1;
		System.out.println(result);
		result = c << 2;
		System.out.println(result);
		result = c << 3;
		System.out.println(result);
		
		System.out.println(Integer.toBinaryString(c));
		result = c << 1;
		System.out.println(Integer.toBinaryString(result));
		result = c << 2;
		System.out.println(Integer.toBinaryString(result));
		result = c << 3;
		System.out.println(Integer.toBinaryString(result));
	}

}
