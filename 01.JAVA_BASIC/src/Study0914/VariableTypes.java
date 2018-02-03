package Study0914;

public class VariableTypes {
	public static void main(String[] args){
		boolean bool1;
		bool1 = true;
		boolean bool2 = false;
		
		System.out.println("bool1 = " + bool1);
		System.out.println("bool2 = " + bool2);
		
		/*
		 * 문자형 (문자형 리터럴 --> 'A', 'a',  '김')
		 */
		
		char munja1;
		munja1 = 'A';
		char munja2 = '가';
		char munja3 = '힣';
		char munja4 = 65;
		char munja5 = 44608;
		char munja6 = (char)(munja1 + 1); // 65 +1 = 66(B)
		System.out.println(munja1);
		System.out.println(munja2);
		System.out.println(munja3);
		System.out.println(munja4);
		System.out.println(munja5);
		System.out.println(munja6);
		System.out.println(Integer.toBinaryString(munja6));
		
		/*
		 *  숫자
		 *  1. 정수형(정수형 리터럴 --> 1, 2, 3, 4, 78 ..)
		 *  	byte --> short --> int --> long
		 */
		
		byte b;
		short s;
		int i;
		long l;
		/*
		 *  정수형 리터럴의 경우 메모리에 4byte할당된다.
		 */
		b = 128-1; // (버퍼 플로우)
		s = 32767;
		/*
		 *  - 정수형 리터럴인 경우에는 대입되는 변수의 범위안에 들면 형변환해서 대입
		 *  - 정수형 변수인 경우는 안됨
		 */
//		int ii = 1;
//		byte bb = ii;
		i = 2147483647;
		// l = 2147483648;
		
		/*
		 * 실수형 리터럴인 경우에는 메모리에 8byte (double)로 할당된다.
		 */
		float f = 1.141592f;
		double d = 1.141592;
		
		/*
		 *  문자열(객체)형
		 */
		String str1, str2, str3;
		str1 ="오늘은 변수타입과 ";
		str2 ="연산자에 대해 공부합니다.";
		
		str3 = str1 + str2;
		System.out.println(str1);
		System.out.println(str2);
		System.out.println(str3);
	}
	
}
