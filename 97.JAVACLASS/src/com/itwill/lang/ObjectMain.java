package com.itwill.lang;

import java.util.Date;

public class ObjectMain {

	public static void main(String[] args) {
		/*
		 * public boolean equals(Object obj)
		 * 		- Indicates whether some other object is "equal to" this one.
		 *		- 객체 주소 비교
		 */
		
		Object o1 = new Object();
		Object o2 = new Object();
		Object o3 = o1;
		
		if(o1.equals(o3)){
			System.out.println("o1, o3는 주소가 동일하다.");
		}
		
		if(o1 == o3){
			System.out.println("o1, o3는 주소가 동일하다.");
		}
		
		/*
		 * public String toString()
				- Returns a string representation of the object.
		 */
		String str1 =  o1.toString();
		System.out.println(str1);
		System.out.println(o1.toString());
		
		Date today = new Date();
		String str2 = today.toString();
		System.out.println(str2);
	}

}
