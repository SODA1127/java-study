package Study0918;
public class WhileNested {
	public static void main(String[] args) {
		int i =0;
		while(i< 5){
			int j = 0;
			while(j < 5){
				System.out.print("★[" + i + ", " +  j  + "] ");
				j ++;
			}
			System.out.println();
			i ++;
			/* ☆★ ★ ★ ★
			 * ★ ☆ ★ ★ ★
			 * ★ ★ ☆ ★ ★
			 * ★ ★ ★ ☆ ★
			 * ★ ★ ★ ★ ☆
			 * */
		}
	}
}