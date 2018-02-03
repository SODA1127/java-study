package Study0915;

/* switch 문
 - 형식
    switch(변수){
    	case 값_1:
    	  stmt1;
    	  break;
    	case 값_2:
    	  stmt2;
    	  break;  
        case 값_n:
          stmt3;
    	  break;
        default:
          stmt4;
          break;
    }
switch(변수)  변수값은 byte, short, int, char, String(jdk1.8)
              값이올수있다.(long은 안됨) */

public class SwitchTest {
	public static void main(String[] args){
		int level = 5; // 레벨값은 1 ~ 5
		String msg = " ";
		switch (level) {
			case 1:
				msg = "초보시군요!";
				break;
			case 2:
				msg = "쫌 하시네요!";
				break;
			case 3:
				msg = "잘 하시네요!";
				break;
			case 4:
			case 5:
				msg = "아주 잘 하시네요!";
				break;
			default:
				msg = "레벨 값은 1 ~ 5 사이의 정수입니다.";
				break;
		}
		System.out.println(msg);
	}
}










