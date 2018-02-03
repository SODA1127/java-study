
public class ReferenceVariableMain {
	public static void main(String[] args) {
		/*
		 * 참조(주소)변수
		 */
		Member m1 = new Member();
		m1.no = 1;
		m1.name = "KIM";
		
		Member m2 = m1;

		System.out.println(m1.no);
		System.out.println(m2.no);

		System.out.println(m1.name);
		System.out.println(m2.name);
		
		if(m1 == m2){
			System.out.println("m1과 m2의 주소값이 같습니다.");
		}
		
		Member m3 = new Member();
		m3.no = 2;
		m3.name = "LEE";
		if(m1 != m3){
			System.out.println("m1과 m2의 주소값이 다릅니다.");
		}
		
		Member m4 = new Member();
		m4.no = 1;
		m4.name = "KIM";
		if(m1 != m4){
			System.out.println("m1과 m4의 주소값이 다릅니다.");
		}
		
		/*
		 * 1. 기본타입 변수값 바꾸기
		 */
		int x = 1;
		int y = 3;
		
		int temp = y;
		y = x;
		x = temp;
		System.out.println("x : " + x);
		System.out.println("y : " + y);
		
		/*
		 * 2. 참조타입 변수 주소값 바꾸기
		 */
		Member fm = new Member();
		fm.no = 1111;
		fm.name = "김성연";
		
		Member sm = new Member();
		sm.no = 2222;
		sm.name = "김재현";
		
		Member tempMember = sm;
		sm = fm;
		fm = tempMember;
		System.out.println("fm : " + fm.no + ", "+ fm.name);
		System.out.println("sm : " + sm.no + ", " + sm.name);
	}
}