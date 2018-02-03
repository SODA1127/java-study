package Study0915;

public class SwitchUse {

	public static void main(String[] args) {
		/*
		 * 홀수 짝수 판별
		 */
		int num =22;
		int tempNum = num%2;
		switch (tempNum) {
		case 0:
			System.out.println(num + "는 짝수");
			break;
		case 1:
			System.out.println(num + "는 홀수");
			break;
		}
		/*
		 * 4의 배수 판별
		 */
		int num2 = 45;
		switch (num2%4) {
		case 0:
				System.out.println(num2 + "는 4의 배수입니다.");
			break;
		case 1:;
		case 2:
		case 3:
			System.out.println(num2 + "는 4의 배수가 아닙니다.");
			break;
			}
		/*
		 * 입력되는 문자가 숫자인지 문자인지 판별
		 */
		
		char c = '1';
		switch (c) {
		case '0' :
		case '1' :
		case '2' :
		case '3' :
		case '4' :
		case '5' :
		case '6' :
		case '7' :
		case '8' :
		case '9' :
			System.out.println(c + "는 숫자입니다.");
			break;
		default:
			System.out.println(c + "는 숫자가 아닙니다.");
			break;
		}
	}

}
