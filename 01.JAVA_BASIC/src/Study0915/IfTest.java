package Study0915;

/*제어문
   1. if 문
       -형식 : 
	      stmt0;
		  if(조건문 ){ -> 논리형데이타가 반환되는 연산 혹은 논리형변수(리터럴 데이터)
			  stmt1;
		   }
		   else{
		      stmt2;
		   }
		   stmt3;
		   조건데이타가 true인경우  stmt0 -> stmt1 -> stmt3;
		   조건데이타가 false인경우  stmt0 -> stmt2 -> stmt3;
 */

public class IfTest {
	public static void main(String[] args) {
		System.out.println("stmt0");
		/*if (true) {
			System.out.println("stmt1 - 1");
		}
		else {
			System.out.println("stmt - 2");
		}*/
		
		//boolean condition = false;
		boolean condition = true;
		
		if(condition){
			int f = 90;
			System.out.println(f);
			System.out.println("stmt2 - 1");
			System.out.println("stmt2 - 1");
			System.out.println("stmt2 - 1");
		}
		else{
			System.out.println("stmt2 - 2");
			System.out.println("stmt2 - 2");
			System.out.println("stmt2 - 2");
		}
		//System.out.println(f);
		int x = 30;
		int y = 21;
		if (x > y) {
			System.out.println("stmt3 - 1 : " + (x > y));
		}
		else{
			System.out.println("stmt3 - 2");
		}
		
		if (x < y) {
			System.out.println("stmt4 - 1");
		}
		else{
			System.out.println("stmt4 - 2 : " + (x < y));
		}
		
		if (x == y) {
			System.out.println("stmt5");
		}
		if (x != y) {
			System.out.println("stmt6 : " + (x != y));
		}
		
		if (x == y) {
			System.out.println("stmt7 -1 : " + (x==y));
		}
		else
			System.out.println("stmt7 -2 : " + (x==y));
			System.out.println("stmt8");
			
		if (x != y) {
			System.out.println("stmt9 : " + (x != y));
			System.out.println("stmt10");
			
		}
		
		System.out.println("stmt99");
	}
}







