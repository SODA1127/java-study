package com.itwill.lang;

public class MathMain {

	public static void main(String[] args) {
		/**
	     * Don't let anyone instantiate this class.
	     */
		// Math math = new Math();
		System.out.println(Math.abs(-9000));
		System.out.println(Math.max(234, 678));
		System.out.println(Math.min(234, 678));
		System.out.println(Math.sqrt(2));
		System.out.println(Math.round(2));
		System.out.println(Math.round(23.568 * 100));
		/*
		 * public static double random()
				- Returns a double value with a positive sign, greater than or equal to 0.0 and less than 1.0.
		 */
		System.out.println("1 ~ 10 사이의 정수 랜덤하게 생성");
		System.out.println((int)(Math.random() * 10 + 1));
		System.out.println((int)(Math.random() * 10 + 1));
		System.out.println((int)(Math.random() * 10 + 1));
		System.out.println((int)(Math.random() * 10 + 1));
		System.out.println((int)(Math.random() * 10 + 1));
		
		
		System.out.println("1 ~ 45 사이의 정수 랜덤하게 생성");
		System.out.println((int)(Math.random() * 45 + 1));
		System.out.println((int)(Math.random() * 45 + 1));
		System.out.println((int)(Math.random() * 45 + 1));
		System.out.println((int)(Math.random() * 45 + 1));
		System.out.println((int)(Math.random() * 45 + 1));
		System.out.println((int)(Math.random() * 45 + 1));
		System.out.println((int)(Math.random() * 45 + 1));
		

		
	}

}
