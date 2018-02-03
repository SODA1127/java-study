package Study0914;

/*
 *  형변환 (Casting) --> 숫자형 데이터간에만 가능
 *  	- 형식 : (데이터 타입) 변수 or 상수;
 *  	- 자동형 변환  (작은 데이터 --> 큰 변수) upCasting
 *  		byte --> short --> int --> long --> float --> double
 *  	-강제 형변환 (큰 데이터 --> 작은 변수) downCasting
 *  		double --> float --> long --> int --> short --> byte 
 */
//upCasting (Promotion)

public class TypeCasting {

	public static void main(String[] args) {
		byte b = 1;
		short s = 12;
		int i = 9090;
		long l = 1234;
		
		float f = 2.14f;
		double d = 0.23;
		
		/*
		 * 자동 형변환
		 */
		double d1 = (double)b;
		d1 = b;
		d1 = s;
		d1 = i;
		d1 = l;
		
		/*
		 * 강제 형변환
		 * 		-  형변환 연산자
		 * 		(타입) 변수, 리터럴
		 */
		
		byte b1 = (byte)s;
		System.out.println(b1);
		b1 = (byte)127;
		System.out.println(b1);
		b1 = (byte)b;
		System.out.println(b1);
		b1 = (byte)i;
		System.out.println(b1);
		b1 = (byte)l;
		System.out.println(b1);
		b1 = (byte)2147483647;
		System.out.println("(byte)2147483647 -> " + b1);
		b1 = (byte)'A';
		b1 = (byte)'힣';
		System.out.println("(byte) '힣' -> " + b1);
		System.out.println("-----반올림-----");
		double davg = 85.534;
		int		iavg	= (int)davg;
		//System.out.println("(int)85.534 -> " + iavg);
		
		/*
		 *  Quiz : 반올림 하세요
		 */
		
		double up;
		up = davg - iavg;
		if(up >= 0.5){
			iavg += 1;
		}
		System.out.println("85.534 반올림 = " + iavg);
		
		/*
		 * 연산시의 형변환
		 */
		double result  =  b + s + i + l + d + f;
		
		/*
		 * 연산시의 형변환 예외
		 * byte와 short의 연산시에는 모든항이 Integer로 casting 된 후 연산
		 */
		
		byte b2 = 9;
		short s2 = 10;
		
		int sResult = b2 + s2;

	}

}
