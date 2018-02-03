package Study0915;
import java.util.Scanner;


public class ScannerIsLeapYear {
	public static void main(String[] args){
		Scanner keyBoard = new Scanner(System.in);
		/*
		 *  String (문자열) 입력받기
		 */
		System.out.println("키보드로부터 입력받기위해 주흐름(쓰레드) 대기");
		String readLine = keyBoard.nextLine();
		System.out.println("키보드로부터 입력후 엔터키입력시 실행");
		System.out.println("키보드로부터 입력 데이터 : " + readLine);
		System.out.println("---------------------------------------------");
		
		/*
		 * int 입력받기
		 */
		
		System.out.print("연도를 입력하세요 : ");
		int year = keyBoard.nextInt();
		System.out.println("입력받은 연도 : " + year);
		
	}
}
