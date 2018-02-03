
public class ObjectInitialize {
	/*
	 * 멤버변수 자동초기화
	 *	int --> 0
	 *	double --> 0.0
	 *	char ==> '\u0000'
	 *	boolean --> false
	 *	String(참조) --> null (주소리터럴 - 주소를 갖고있지 않는 값)
	 */
	public int member1;
	public double member2;
	public char member3;
	public boolean member4;
	public String member5;
	
	public int member11 = 50;
	public double member22 = 1.4;
	public char member33 = 'A';
	public boolean member44 = true;
	public String member55 = "문자열";
}
