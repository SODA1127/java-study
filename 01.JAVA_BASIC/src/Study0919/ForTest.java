package Study0919;
/*for문
     -형식: 
       for(1;2;3){
	       	//1.반복변수(선언,초기화가능)
	       	//2.반복변수의 조건검사(논리형데이타)
	       	//3.반복변수증,감(++,--)
	       	stmt1;
       }
       flow
       		1 -->  2(true) --> stmt1
       		3 --> 2(true) --> stmt1 (반복)
       		3 --> 2(false) --> loop 빠져나감
       
       ex)
       
       for(int i=0;i<10;i++){
       	 stmt1;
       }
       
       ex) 무한루프
       for(;;){
       }*/
public class ForTest {
	public static void main(String[] args) {
		System.out.println("------------------------1. 증가------------------------");
		for (int i = 0; i < 10; i ++) {
			System.out.println("i = " + i);
		}
		
		System.out.println("------------------------2. 감소------------------------");
		for (int i = 10; i > 0; i --) {
			System.out.println("i = " + i);
		}
		
		System.out.println("------------------------3. 짝수출력 (1 ~ 10)------------------------");
		for (int i = 0; i < 10; i++) {
			int su = i + 1;
			if(su % 2 == 0){
				System.out.print(su + ", ");
			}
		}
		System.out.println();
		
		System.out.println("------------------------3. 4의 배수 출력 (1 ~ 100)------------------------");
		for(int i = 0; i < 100; i++){
			int su = i + 1;
			if(su % 4 == 0){
				System.out.print(su + ", ");
			}
		}
		System.out.println();
		
		System.out.println("------------------------4. 첫 번째나오는 4의 배수 출력 (1 ~ 100)------------------------");
		for(int i = 0, count = 0; i < 100; i++){
			int su = i + 1;
			if(su % 4 == 0){
				count ++;
				if(count % 3 == 0){
					System.out.println(su);
					break;
				}
			}
		}
		System.out.println();
		
		System.out.println("------------------------5. 4의 배수가 아닌 수 출력 (1 ~ 100) (continue;)------------------------");
		for(int i = 0; i < 100; i++){
			int su = i + 1;
			if(su % 4 == 0){
				/*
				 * continue문이 실행되면
				 * 현재 실행되는 loop문장이후를 실행하지 않고
				 * 다음 loop를 실행
				 */
				continue;
			}
			System.out.print(su + ", ");
		}
		
		System.out.println();
		
		System.out.println("------------------------6. 1 ~ 10 사이의 정수의 합------------------------");
		int tot = 0;
		for(int i = 0; i < 10; i++){
			int su = i + 1;
			//tot = tot + su;
			tot += su; //연산 후 대입
		}
		System.out.println(">>> 정수의 합 : " + tot);
		
		System.out.println();
		
		System.out.println("------------------------7. 1 ~ 10 정수의 홀수 합, 짝수 합------------------------");
		int oddTot = 0;
		int evenTot = 0;
		for(int i = 0; i < 10; i++){
			int su = i + 1;
			if(su % 2 == 0){
				evenTot += su;
			}
			else{
				oddTot += su;
			}
		}
		System.out.println("짝수 합 : " + evenTot);
		System.out.println("홀수 합 : " + oddTot);
		
		System.out.println();
		
		System.out.println("------------------------8. 자바문자 중에 영문대(소), 숫자형 문자 출력(한글 제외)------------------------");
		
		for (int i = 0; i < 128; i++) {
			char c = ' ';
			if((48 <= i && i <= 57) || (65 <= i && i <= 90) || (97 <= i && i <= 122)){
				if(48 <= i && i <= 56){
					c = (char) i;
					System.out.print(c + ", ");
				}
				else if(i == 57){
					System.out.println();
				}
				else if(65 <= i && i <= 89){
					c = (char) i;
					System.out.print(c + ", ");
				}
				else if(i == 90){
					System.out.println();
				}
				else if(97 <= i && i <= 122){
					c = (char) i;
					System.out.print(c + ", ");
				}
				else
					System.out.println();
			}
		}
///////		
	}
}
