package Study0918;

/* 반복문
     stmt1;
     while(조건문){
		 //조건문 --> 논리형데이타를 반환하는 연산 - 비교(논리형 리터럴, 논리형 변수)
		stmt2;
	 }
	 stmt3;
     
	 흐름  stmt1 --> 조건식의 데이타가 true인동안 stmt2를 반복실행 --> stmt3 */

public class WhileTest {
	public static void main(String[] args) {
		System.out.println("stmt : 0");
		
		
		/*
		 * stmt1을 10번 실행
		 */
		System.out.println("----------case1-----------");
		//반복을 컨트롤하는 변수
		int i = 0;
		while(true){
			System.out.println("stmt1 : i = " + i);
			i ++; // i += 1;
			if(i == 10){
				/*
				 * break가 실행되는 순간 반복 블록을 빠져나옴
				 */
				break;
			} // end if
			System.out.println("stmt1 - 1");
		} // end while
		
		System.out.println("----------case2(조건변수값의 변경)-----------");
		boolean isPlay = true;
		i = 0;
		while(isPlay){
			System.out.println("stmt2 : i = " + i);
			i ++;
			if(i == 10){
				isPlay = false;	
			}
			System.out.println("----------case3(조건연산(비교, 논리)식)-----------");
			i = 0;
			while(i < 10){
				System.out.println("stmt3 : i = " + i);
				i ++;
			}
		}
		System.out.println("case3");
		System.out.println("stmt : 99 --> main end");
	}
}
