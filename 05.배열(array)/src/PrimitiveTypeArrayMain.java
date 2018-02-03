/*
		 배열:  
		      - 같은데이타형을 가진 기억장소여러개의 모음 
		      - 배열변수의 선언형식
		           데이타타입[] 이름; 
			  - 사용: 
			       1.배열객체의생성	
				   2.배열객체 멤버들의 초기화 
		      -특징   
				  1.모든 배열형의 변수는 참조변수이다.
				    (배열은 객체다.)
				  2.같은타입만 정의가가능하다 
				  3.길이가 고정되어있다. 
 */

/*
 		int a;
		a = 0;
		
		int[] ia;
		ia = new int[5];
		System.out.println("ia 멤버변수 개수 : " + ia.length);
		
		ia[0] = 1;
		ia[1] = 2;
		ia[2] = 3;
		ia[3] = 4;
		ia[4] = 5;
		
		for (int i = 0; i < ia.length; i++) {
			System.out.println("ia : " + ia[i]);
		}
		
		System.out.println("----------------- 기본형 1차원 배열 ------------------");
		int[] korArray = new int[10];
		System.out.println(">> 멤버변수(배열요소) 배열 자동초기화");
		for (int i = 0; i < korArray.length; i++) {
			System.out.print(korArray[i]);
			System.out.print(" ");
			
		}
		
		korArray[0] = 90;
		korArray[1] = 45;
		korArray[2] = 22;
		korArray[3] = 78;
		korArray[4] = 99;
		korArray[5] = 12;
		korArray[6] = 81;
		korArray[7] = 45;
		korArray[8] = 78;
		korArray[9] = 33;
		
		System.out.println();
		for (int i = 0; i < korArray.length; i++) {
			System.out.print(korArray[i]);
			System.out.print(" ");
		}
		
		System.out.println(">> 국어점수 총점, 평균");
		int korTot = 0;
		double korAvg = 0;
		for (int i = 0; i < korArray.length; i++) {
			korTot += korArray[i];
		}
		korAvg = (double)korTot / korArray.length;
		System.out.println("총점 : " + korTot);
		System.out.println("평균 : " + korAvg);
		
		System.out.println("----- char Array");
		char[] charArray = new char[10];
		charArray[0] = 'H';
		charArray[1] = 'e';
		charArray[2] = 'l';
		charArray[3] = 'l';
		charArray[4] = 'o';
		charArray[5] = '!';
		charArray[6] = 'J';
		charArray[7] = 'a';
		charArray[8] = 'v';
		charArray[9] = 'a';
		
		for (int i = 0; i < charArray.length; i++) {
			System.out.print(charArray[i]);
		}
		System.out.println();
		
		System.out.println(">> 배열의 초기화");
		int[] engArray = {34, 56, 23, 89, 34, 55, 90, 12, 99, 10};
		for (int i = 0; i < engArray.length; i++) {
			System.out.println(engArray[i] + " ");
		}
		boolean[] resultArray = {false, true, false, true, false, true, false, true, false, true};
		int correctCount = 0;
		for (int i = 0; i < resultArray.length; i++) {
			if(resultArray[i]){
				correctCount ++;
				
			}
		}
		System.out.println("정답수 : "  + correctCount);
		System.out.println("오답수 : " + (resultArray.length - correctCount));
 */

public class PrimitiveTypeArrayMain {

	public static void main(String[] args) {		
		
		System.out.println("/******************************************************* 석차계산 *********************************************************/");
		String[] nameArray = {"KIM", "LEE", "PARK",
				"CHOI", "SIM", "JIM",
				"AIM", "BAM", "HIM",
				"HONG"};
		int[] mathArray = {34, 56, 23, 89, 34, 55, 90, 12, 99, 10}; // 10
		int[] rankArray = {1, 1, 1, 1, 1, 1, 1, 1, 1, 1}; // 10
		
		System.out.println();
		
		System.out.println("-------------- 기존 --------------");
		for (int i = 0; i < mathArray.length; i++) {
			System.out.print(nameArray[i] +"   " + " \t ");
		}
		System.out.println();
		for (int i = 0; i < mathArray.length; i++) {
			System.out.print(mathArray[i] +" 점 " + " \t ");
		}
		System.out.println();
		for (int i = 0; i < rankArray.length; i++) {
			System.out.print(rankArray[i] + "  등 " + " \t ");
		}
		
		System.out.println();
		System.out.println("-------------- 석차 정렬 --------------");
		
		for (int i = 0; i < mathArray.length; i++) {
			System.out.print(nameArray[i] +"   " + " \t ");
		}
		System.out.println();
		for (int i = 0; i < mathArray.length; i++) {
			System.out.print(mathArray[i] +" 점 " + " \t ");
		}
		for (int i = 0; i < rankArray.length; i++) {
			for (int j = 0; j < rankArray.length; j++) {
				if (mathArray[i] < mathArray[j])
					rankArray[i]++;
			}
		}
		System.out.println();
		for (int i = 0; i < rankArray.length; i++) {
			System.out.print(rankArray[i] + "  등 " + " \t ");
		}
		for (int i = 0; i < rankArray.length; i++) {
			rankArray[i] = 1;
		}
		
		System.out.println();
		System.out.println("-------------- 석차 오름차순 정렬 --------------");
		for (int i = 0; i < mathArray.length; i++) {
			for (int j = 0; j < mathArray.length - 1; j++) {
				if(mathArray[j] > mathArray[j+ 1]){
					int tempMath = mathArray[j];
					mathArray[j] = mathArray[j + 1];
					mathArray[j + 1] = tempMath;
					
					String tempName = nameArray[j];
					nameArray[j] = nameArray[j + 1];
					nameArray[j + 1] = tempName;
				}
			}
		}
		
		for (int i = 0; i < rankArray.length; i++) {
			for (int j = 0; j < rankArray.length; j++) {
				if (mathArray[i] < mathArray[j])
					rankArray[i]++;
			}
		}
		
		for (int i = 0; i < mathArray.length; i++) {
			System.out.print(nameArray[i] +"   " + " \t ");
		}
		System.out.println();
		for (int i = 0; i < mathArray.length; i++) {
			System.out.print(mathArray[i] +" 점 " + " \t ");
		}
		System.out.println();
		for (int i = 0; i < rankArray.length; i++) {
			System.out.print(rankArray[i] + " 등 " + " \t ");
		}
		
		}
	}





