package Study0918;

public class WhileUse {

	public static void main(String[] args) {
		/*
		 * 1 ~ 10 사이의 정수를 출력하세요. (10번 출력)
		 */
		int i = 0;
		
		while(i < 10){
			int tempSu = i + 1;
			System.out.print(tempSu + ", ");
			i ++;
		}
		System.out.println();
		System.out.println("i : " + i);
		//System.out.println(tempSu);
		/*
		 * 1 ~ 10 사이의 정수를 출력하세요. (홀수만 출력)
		 */
		i = 0;
		while(i < 10){
			int tempSu = i + 1;
			if(tempSu % 2 == 1){
				System.out.print(tempSu + ", ");
			}
			i ++;
		}
		System.out.println();
		/*
		 * 1 ~ 10 사이의 정수를 출력하세요. (4의배수 출력)
		 */
		i = 0;
		while(i < 100){
			int tempSu = i + 1;
			if(tempSu % 4 == 0){
				System.out.print(tempSu + ", ");
			}
			i ++;
		}
		System.out.println();
		/*
		 * 영문 대문자(소문자, 숫자형 문자)를 출력하세요.
		 */
		char c = 'A';
		while(c <= 'Z'){
			System.out.print(c + ", ");
			c ++;
		}
		System.out.println();
		
		/*
		 * 	ABCD
		 * 	EFGH
		 * JKLM
		 * 	NOPQ
				System.out.print('A');
				System.out.print('B');
				System.out.print('C');
				System.out.print('D');
				System.out.println();
				System.out.print('E');
				System.out.print('F');
				System.out.print('G');
				System.out.print('H');
				System.out.println();
		*/
		char munja = 'a';
		int munjaCount = 0;
		while(munja <= 'z'){
			System.out.print(munja + ", ");
			munjaCount ++;
			if(munjaCount%4 == 0){
				System.out.println();
			}
			munja ++;			
		}
		
		/*
		 *  Quiz1 : 한글 출력하시오('가' --> '힣')
		 *  			한줄에 한글 50글자 출력
		 * 
		 *  Quiz2 : 문자가 아이디로 적절한지 판단 후 출력
		 *  		(아이디는 영문 대(소), 문자, 숫자만 가능)
		 *  
		 *  		ex) guard123, @guar%d234
		 */
		
		System.out.println();
		char ha = '가';
		int haCount = 0;
		while(ha <= '힣'){
			System.out.print(ha + " ");
			haCount ++;
			if(haCount %20 == 0){
				System.out.println();
			}
			ha ++;
		}
	}

}
