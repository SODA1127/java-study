package Study0915;
import java.util.Scanner;

public class IfScoreTest {
	public static void main(String[] args) {
		int kor,eng,math;
		Scanner scan = new Scanner(System.in);
		
		System.out.println("*********************");
		System.out.println("----성적 계산기----");
		System.out.println("*********************");
		System.out.println("국어 입력 : ");
		kor = scan.nextInt();
		System.out.println("영어 입력 : ");
		eng = scan.nextInt();
		System.out.println("수학 입력 : ");
		math = scan.nextInt();
		if((0 <= kor) && (kor <= 100) && (0 <= eng) && (eng <= 100) && (0 <= math) && (math <= 100)){
			System.out.println("유효 점수");
		}
		else{
			System.out.println("다시 입력");
			return;
			//System.exit(0);
		}
		
		
		int sum = kor + eng + math;
		double avg = (double)(sum) / 3;
		int avgi = (int)(avg) / 10;
		char grade = ' ';
		char a = 'A';
		char b = 'B';
		char c = 'C';
		char d = 'D';
		char f = 'F';
		System.out.println("*********************");
		System.out.println("국어 : " + kor);
		System.out.println("영어 : " + eng);
		System.out.println("수학 : " + math);
		System.out.println("총점 : " + sum);
		
		int  num = (int)(avg); 
		System.out.println(num);
		double dot = avg -  num; 
		
		double q1 = (int)(100 * dot); 
		double d1 = q1/100; 
		avg = num + d1;
		System.out.println("평균 : " + avg);
		System.out.print("평점 : ");
		switch (avgi) {
		case 10:
			System.out.println(a);
			break;
		case 9:
			System.out.println(b);
			break;
		case 8:
			System.out.println(c);
			break;
		case 7:
			System.out.println(d);
			break;
		case 6:
		case 5:
		case 4:
		case 3:
		case 2:
		case 1:
		case 0:
			System.out.println(f);
			break;
		default :
			System.out.println("값이 정수가 아닙니다.");
			break;
	}
		System.out.println("*********************");
			
		}
}
	/*
	if((avg >= 0) && (avg <= 100)){
	System.out.println("유효 점수");
	if((avg >= 90)){
		grade = 'A';
	}else if(avg >= 80){
		grade = 'B';
	}else if(avg >= 70){
		grade = 'C';
	}else if(avg >= 60){
		grade = 'D';
	}else{
		grade = 'F';
	}
	else{
	System.out.println("유효 점수 아님");
	}*/
		
		/*옛날일....
		국어,영어,수학 점수를 가지고 
		총점,평균,평점(A,B,C....)을 switch로 출력하시요....
           - 100점이 넘는 수나 음수가 입력되면 메세지를 출력하세요
           - 평균은 소수점이하 2자리수까지만 출력하세요
           - 출력포맷
			 
			 ************************
			 국어: 78
			 영어: 56
			 수학: 77
			 총점:256
			 평균:78.56
			 평점: C
			 *************************/
