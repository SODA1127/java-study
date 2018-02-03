package Study0914;
import java.util.Scanner;

public class IsLeapYear {
	public static void main(String[] args) {
		/*
	 	* 윤년 여부판단 후 출력
	 	* 
	 	* 그레고리력의 정확한 윤년 규칙
	 	* 
	 	*/
		
		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);
		
		String j;
		int year;
		//String Leap = "윤년"; // 4년 마다 400년
		//String Py = "평년"; // 100년 마다
		
		System.out.println("확인할 연도를 입력하세요 : ");
		year = scan.nextInt();
		
		boolean isLeapYear = (year%4  == 0) && (year%100 != 0) || (year%400  == 0);
		boolean isPyYear = (year%4  == 0) && (year%100 == 0) && (year%400  != 0);
		
		/*for(int i = 0; i < year; i++){
			if (i%4 == 0){
				j = Leap;
				if(i%100 == 0){
					j = Py;
					if(i%400 == 0){
						j = Leap;
					}
				}
			}
		}*/
		
		System.out.println(year + "년은 윤년인가요? : "  + isLeapYear );
		System.out.println(year + "년은 평년인가요? : "  + isPyYear );
	}
}
