package Study0915;

import java.util.Scanner;

public class ScannerIfScoreTest {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("국어 점수를 입력하세요. (정수) : ");
		int kor = scanner.nextInt();
		System.out.print("영어 점수를 입력하세요. (정수) : ");
		int eng = scanner.nextInt();
		System.out.print("수학 점수를 입력하세요. (정수) : ");
		int mat = scanner.nextInt();
		
		int tot = kor + eng + mat;
		
		System.out.println("-------------------------------");
		System.out.println("국어 : " + kor);
		System.out.println("영어 : " + eng);
		System.out.println("수학 : " + mat);
		System.out.println("총점 : " + tot);
		System.out.println("평균 : " + tot/3.0);
		System.out.println("평점 : " );
	}
}
