package Study0914;

import java.util.Scanner;

public class Round {
	public static void main(String[] args) {
		/*
		 * 1. 다음 데이터를 소수점 이하 두째자리 까지 표시 85.55
		 * 2. 다음 데이터를 소수점 이하 셋째자리 까지 표시 85.555 -> 반올림하여 소수점 이하 표시 
		 */
		double avg ;
		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);
		System.out.println("숫자 입력 : ");
		avg = scan.nextDouble();
		
		int  num = (int)(avg); // 85
		System.out.println(num);
		double dot = avg -  num; //0.55555
		
		double q1 = (int)(100 * dot); //55
		double d1 = q1/100; //0.55
		double sum1 = num + d1;
		System.out.println("둘째 자리 : " +sum1);
		
		double q2 = (int)(1000 * dot); //555
		double d2 = q2/1000; //0.55
		double sum2 = num + d2;
		System.out.println("셋째 자리 : " +sum2);
		
		//boolean chk = (1 > d2 && d2 >= 0.5); //true
		double sum3 = (double)(avg * 1000000 + 5000) / 1000000;
		
		System.out.println(sum3);
		double q4 = (int)(100 * sum3); //8556
		double d3 = q4/100;
		System.out.println("셋째 자리 : " + d3);
	}
}
