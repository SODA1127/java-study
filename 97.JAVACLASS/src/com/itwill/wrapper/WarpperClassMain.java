package com.itwill.wrapper;

import java.util.ArrayList;

/*
- Wrapper 클래스

	자바데이타형은 기본데이타형과 레퍼런스 데이타 형으로 구분됩니다.
	기본데이타형으로는 int,boolean,double 등이 제공됩니다.
	1.이런기본 데이타형을 객체로 사용할수있는 방법으로 
		Wrapper 클래스가 제공됩니다.
	2.Wrapper 클래스는 각종유용한 기능들을 메서드로 제공받을수있다는
		장점이있습니다.
	
	Integer,Boolean,Double,Character,Float,Long,Byte,Short
	
 */
public class WarpperClassMain {

	public static void main(String[] args) {

		// int i1=34;
		/******** Boxing(Wrapping) ******/
		Integer wi1 = null;
		wi1 = new Integer(34);
		Integer wi2 = new Integer("34");

		Double wd1 = new Double(1.234);
		Double wd2 = new Double("1.234");

		Boolean wb1 = new Boolean(true);
		Boolean wb2 = new Boolean("true");

		Character wc1 = new Character('A');

		/******** UnBoxing(UnWrapping) ******/
		int i1 = wi1.intValue();
		int i2 = wi2.intValue();
		double d1=wd1.doubleValue();
		double d2=wd2.doubleValue();
		boolean b1=wb1.booleanValue();
		boolean b2=wb2.booleanValue();
		char c1=wc1.charValue();
		/******** auto boxing(Wrapping) ******/
		Integer wi3 = 34;
		Integer wi4 = 34;
		Double wd3=1.234;
		Double wd4=1.234;
		Boolean wb3=true;
		Boolean wb4=true;
		Character wc2='A';
		
		/******** auto unboxing(Wrapping) ******/
		int i3 = wi3;
		int i4 = wi4;
		int i5 = new Integer(34);
		double d3=wd3;
		double d4=wd4;
		
		/********autoboxing-->up casting************/
		Object oa=wi1;
		Object ob=wd1;
		Object oc=wb1;
		Object od=wc1;
		
		Object o1 = 2331;
		Object o2 = 2.314;
		Object o3 = true;
		Object o4 = 'A';
		
		ArrayList<Integer> scoreList=new ArrayList<Integer>();
		scoreList.add(new Integer(67));
		scoreList.add(89);
		scoreList.add(61);
		scoreList.add(81);
		System.out.println(scoreList);
		
		for (int i = 0; i < scoreList.size(); i++) {
			//Object tempScore = scoreList.get(i);
			int tempScore = scoreList.get(i);
			System.out.print(tempScore+",");
		}
		System.out.println();
		
		
		
		
		
		

	}

}













