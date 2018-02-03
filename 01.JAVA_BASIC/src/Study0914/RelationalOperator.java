/*
 *  관계(비교)연산
 *  	- 형태 : >, < , >= , <= , == , !=
 *  	- 관계 연산의 결과값은 논리형 데이터이다 (true, false)
 */
package Study0914;

public class RelationalOperator {
	public static void main(String[] args) {
		int a = 10;
		int b = 20;
		boolean result;
		
		result = a>b;
		System.out.println("a > b " + result);
		result = a<b;
		System.out.println("a < b " +result);
		result = a>=b;
		System.out.println("a >= b " +result);
		result = a<=b;
		System.out.println("a <= b " +result);
		result = a==b;
		System.out.println("a == b " + result);
		result = a!=b;
		System.out.println("a != b " +result);
		
		System.out.println("----------------문자비교----------------");
		char c1='A';
		char c2='B';
		result = c1 < c2;
		System.out.println("A' < 'B -> " + result);
		
		System.out.println("----------------문자산술 연산----------------");
		char c3='a';
		char c4='z';
		
		int cCount = c4 - c3;
		System.out.println("'z' - 'a' = " + cCount);
		
		int hCount = '힣' - '가';
		System.out.println("'힣' - '가 = '" + hCount);
		
		int c5='힣' - 1;
		System.out.println("'힣' - '가' = " + c5);
	}
}





