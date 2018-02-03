/*
제한자(final)
	1. 클래스 앞에 붙일경우 상속금지 
       ex> public final class Test{}
    2. 멤버메쏘드앞에 붙일경우 
       오버라이딩 금지
       ex> public final void print(){}
    3. 멤버변수 앞에붙일경우--> 상수
       ex> public final int PORT_NUMBER=80;
       상수화된다.    
       변경금지
*/
public class FinalClass {
	public final int PORT_NUMBER = 80;
	public final int INCENTIVE_RATE;
	
	public static final int SOUTH = 1;
	public static final int NORTH = 2;
	public static final int EAST = 3;
	public static final int WEST = 4;
	
	
	
	public FinalClass() { // 생성자까지만 final에 대한 인자값을 넣어주면 됨.
		this.INCENTIVE_RATE = 10;
		
	}
	
	public void method1() {
		System.out.println(PORT_NUMBER);
		System.out.println(INCENTIVE_RATE);
		System.out.println(FinalClass.SOUTH);
		System.out.println(FinalClass.NORTH);
		System.out.println(FinalClass.EAST);
		System.out.println(FinalClass.WEST);
		
		
	}
	
	public final void method2(){
		System.out.println("난 final 메소드 - Overriding 금지");
	}
	public void method3(){
		System.out.println("난 일반메소드 - Overriding 가능");
	}
	
	
	
	
}
