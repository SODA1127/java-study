package Study0915;
import java.util.Scanner;;

public class IfUse {
	@SuppressWarnings("resource")
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		/*
		 * 	수를 입력받아 홀수짝수 판별 후 출력
		 */
		
		int number;
		String msg1;
		
		System.out.println("숫자를 입력 : ");
		number = scan.nextInt();
		
		if(number%2 == 0){
			msg1 = "짝수";
		}
		else{
			msg1 = "홀수";
		}
		System.out.println(">> " + number + "는(은) " + msg1 + "입니다.");
		
		/*
		 * 점수를 입력받아 점수의 유효성을 체크
		 */
		int kor = 45;
		if(!(kor >= 0 && kor <= 100)){
			// 유효하지않은 점수
			System.out.println("점수는 0 ~ 100 사이 정수입니다.");
			//return;
		}
		// 유효한 점수
		System.out.println("유효점수 사용 - 성적 계산 실시");
		
		/*
		 * Quiz
		 *		- if문을 사용하여 윤년구하는 연도를 입력받아 윤년인지 아닌지 
		 * 		평년인지 아닌지 출력 
		 * 		- 국영수 점수를 입력받아 점수의 유효성을 체크를 한 후
		 * 		유효하지 않은 점수일 경우에는 메세지를 출력
		 */
		
		/*
		 * 4의 배수 여부 출력
		 */
		//int su = 56;
		if(number % 4 == 0){
			System.out.println("4의 배수 맞음");
		}
		else{
			System.out.println("4의 배수 아님");
		}
		/*
		 *  입력되는 문자가 영문인지 체크
		 */
		System.out.println("문자를 입력 : ");
		//char c = '9';
		char c = scan.next().charAt(0);
		if((c >= 'a' && c <= 'z') || (c >= 'A' && c <= 'Z')){
			System.out.println(">> " + c + "는 알파벳입니다.");
			if((c >= 'a' && c <= 'z')){
				System.out.println(">> " + c + "는 알파벳 소문자입니다.");
			}
			else{
				System.out.println(">> " + c + "는 알파벳 대문자입니다.");
			}
		}
		else{
			System.out.println(">> " + c + "는 알파벳이 아닙니다.");
			if(c >= '0' && c <= '9'){
				System.out.println(">> " + c + "는 숫자입니다.");
			}
			else{
				System.out.println(">> " + c + "는 숫자가 아닙니다.");
				}
		}
		
		
		/*
		 *  주흐름(쓰레드)를 JVM에 반환한다.
		 *  메소드의 마지막에서 생략의 경우 맨 끝라인에  자동으로 return문 생성.
		 */
		return;
	} // main 끝
} //클래스 끝






