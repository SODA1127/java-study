package Study0915;

import java.util.Scanner;

public class ScannerRound {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("평균을 입력하세요 : ");
		double avg = scan.nextDouble();
		System.out.println("입력받은 평균 : " + avg);
	}

}