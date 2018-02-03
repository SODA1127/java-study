package Study0915;
import java.util.Scanner;

public class IfNested {
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		/*
		 *  점수를 입력받아서 학점(A, B, C, D, E)을 구하시오
		 *  A : 100 ~ 90
		 *  b : 90 ~ 80
		 *  C : 80 ~ 70
		 *  D : 70 ~ 60
		 *  F : 60점 이하
		 */
		int kor = 0;
		char a = 'A';
		char b = 'B';
		char c = 'C';
		char d = 'D';
		char f = 'F';
		
		char grade = ' ';
		
		System.out.println("점수입력 : ");
		kor = scan.nextInt();
		
		if((kor >= 0) && (kor <= 100)){
			System.out.println("유효 점수");
			if((kor >= 90)){
				System.out.println(a);
				grade = 'A';
			}else if(kor >= 80){
				System.out.println(b);
				grade = 'B';
			}else if(kor >= 70){
				System.out.println(c);
				grade = 'C';
			}else if(kor >= 60){
				System.out.println(d);
				grade = 'D';
			}else{
				System.out.println(f);
				grade = 'F';
			}System.out.println("당신의 학점은 " + grade + "입니다.");
		}
		else{
			System.out.println("유효 점수 아님");
		}
		
		/*
		 *  Quiz:
		 *  	학점별로 메세지를 출력하세요
		 *  	ex> D학점 --> 으이그 ㅋㅋ
		 */
		
		System.out.println("점수입력 : ");
		int kor1 = 0;
		kor1 = scan.nextInt();
		kor1 = kor1 / 10;
		switch (kor1) {
			case 10:
				System.out.println("뛰어 납니다! ㅎㅎ : " + a);
				break;
			case 9:
				System.out.println("열심히 공부했군요! ㅎㅎ : " + b);
				break;
			case 8:
				System.out.println("다음부터는 열심히! ㅎㅎ : " + c);
				break;
			case 7:
				System.out.println("대충했군요 ㅡㅡ : " + d);
				break;
			case 6:
				System.out.println("다시 공부해오세요 : " + f);
			default :
				System.out.println("좀 심하네요 : " + f);
				break;
		}
	}
}
