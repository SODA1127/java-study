/*
 *  논리연산자
 *  	- 형태 : ||(OR - 논리합), &&(AND - 논리곱)
 *  	- 좌 우측의 항이 논리형 데이터이다.
 *  	- 결과도 논리형 데이터이다.
 *  	ex) true || false, false && true
 */
package Study0914;

public class LogicalOperator {

	public static void main(String[] args) {
		boolean b1 = false;
		boolean b2 = false;
		boolean b3 =true;
		boolean b4 = true;
		boolean result;
		
		// 논리합 || 
		result = b1 || b2;
		System.out.println("false || false -> " + result);
		// 논리곱 &&
		result = b3 && b4;
		System.out.println("true && true -> " + result);
		System.out.println("------------------------------------------");
		
		/*
		 *  ! : NOT연산자(단항연산자) 
		 */
		boolean myTurn = false;
		myTurn = !myTurn;
		System.out.println(myTurn);
		System.out.println("------------------------------------------");
		
		int kor = 90;
		int eng = 34;
		int mat = 90;
		System.out.println("국어 점수 : " + kor);
		System.out.println("영어 점수 : " + eng);
		System.out.println("수학 점수 : " + mat);
		
		/*
		 *  점수의 유효성 체크 
		 */
		//boolean isValid = kor >= 0 && kor <= 100;
		//System.out.println("국어점수는 유효한가? : " + isValid);
		
		boolean isValid =
				(kor >= 0 && kor <= 100)
				&& (eng >= 0 && eng <= 100) 
				&& (mat >= 0 && mat <= 100);
		
		boolean isNotValid = 
				!(kor >= 0 && kor <= 100)
				&&(eng >= 0 && eng <= 100) 
				&& (mat >= 0 && mat <= 100);
		System.out.println("국영수점수는 유효한가? : " + isValid);
		System.out.println("국영수점수는 유효하지 않은가? : " + isNotValid);
		
		System.out.println("------------------------------------------");
		/*
		 * 국어점수가 90점 이상 이거나 영어점수가 90점 이상일 경우 합격
		 */
		boolean isPass;
		isPass = (kor >= 90) || (eng >= 90);
		System.out.println("국어점수가 90점 이상 이거나 영어점수가 90점 이상일 경우 합격여부는 : " + isPass);
		isPass = kor >= 90 && eng > 90;
		System.out.println("국어점수가 90점 이상 이고 영어점수가 90점 이상일 경우 합격여부는 : " + isPass);
		
		System.out.println("------------------------------------------");
		/*
		 * 국어점수가 90점 이상 이거나 
		 * 영어점수가 90점 이상 이거나 
		 * 수학 점수가 90점 이상일 경우 합격
		 */
		isPass = kor>= 90 || eng >= 90 || mat >= 90;
		System.out.println("국어점수가 90점 이상 이거나  영어점수가 90점 이상 이거나  수학 점수가 90점 이상일 경우 합격여부는 : " + isPass);
		
		/*
		 * 국영수 모두 90점 이상
		 */
		isPass = kor>= 90 && eng >= 90 && mat >= 90;
		System.out.println("국영수 모두 90점 이상 합격여부 : " + isPass);
		
		
	}
}



