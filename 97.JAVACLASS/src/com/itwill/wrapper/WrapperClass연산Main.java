package com.itwill.wrapper;

public class WrapperClass연산Main {
	public static void main(String[] args) {
		/*
		 * 비교연산
		 */
		Integer wi1 = new Integer(89);
		Integer wi2 = 89;
		Integer wi3 = 89;
		Integer wi4 = new Integer(100);
		
		
		/*
		 * 주소 비교 (X)
		 *		- wrapper 주소 == wrapper 주소 : 사용금지
		 */
		if(wi1 == wi2){
			System.out.println("wi1 == wi2 : 주소가 같다");
		}
		if(wi2 == wi3){
			System.out.println("wi1 == wi2 : 주소가 같다");
		}
		
		System.out.println();
		
		/*
		 * 값 비교 (O)
		 */
		if(wi1.intValue() == wi2.intValue()){
			System.out.println("wi1 wi2 : 멤버값이 같다");
		}
		if(wi2.intValue() == wi3.intValue()){
			System.out.println("wi1 wi2 : 멤버값이 같다");
		}
		
		System.out.println();
		
		/*
		 * equals 값 비교 (O)
		 */
		if(wi1.equals(wi2)){
			System.out.println("wi1.equals(wi2) : 멤버값이 같다");
		}
		if(wi2.equals(wi3)){
			System.out.println("w21.equals(wi3) : 멤버값이 같다");
		}
		
		/*
		 * 연산시 auto boxing, unboxing
		 */
		if(wi1.intValue() == 89){
			System.out.println("89 == 89");
		}
		
		if(wi1 > 11){
			System.out.println("89 > 11");
		}
		if(wi4 > wi3){
			System.out.println("wi4 > wi3");
		}
		
		int result = wi1 + wi2; //unboxing
		System.out.println(result);
		result = wi1 - wi2;
		System.out.println(result);
		result = wi1 / wi2;
		System.out.println(result);
	}
}
