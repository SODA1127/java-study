package Study0915;

/*
 *  단항연산자
 *  	- 증가, 감소연산자
 */
public class UnaryOperator {
	public static void main(String[] args) {
		
		boolean isRun = true;
		isRun = !isRun;
		System.out.println(isRun);
		isRun = !isRun;
		System.out.println(isRun);
		
		int a = 10;
		int result = +a;
		System.out.println(result);
		result = -a;
		System.out.println(result);
		System.out.println("----------------(++, --)----------------");
		
		int i = 5;
		int j = 5;
		
		i = i + 1;
		System.out.println("i : " + i);
		j = j - 1;
		System.out.println("j : " + j);
		System.out.println("----------------prefix(앞쪽에 붙어) [++ i, -- j]----------------");
		
		int ri;
		int rj;
		
		i = 5;
		j = 5;
		System.out.println("i : " + i);
		System.out.println("j : " + j);
		
		ri = ++ i;
		rj = -- j;
		System.out.println("ri : " + ri);
		System.out.println("rj : " + rj);
		

		System.out.println("----------------prefix(뒤쪽에 붙어) [i ++, j --]----------------");
		
		i = 5;
		j = 5;
		System.out.println("i : " + i);
		System.out.println("j : " + j);
		
		ri = i ++;
		rj = j --;
		System.out.println("ri : " + ri);
		System.out.println("rj : " + rj);
		
		/*
		 * 단항 비트 연산자 
		 */
		int ii = 1;
		System.out.println(Integer.toBinaryString(ii));
		int iir = ~ ii;
		System.out.println(Integer.toBinaryString(iir));
		int iiir = ~ ii + 1;
		System.out.println(iiir);
	}
}
