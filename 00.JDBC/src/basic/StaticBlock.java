package basic;

public class StaticBlock {
	public StaticBlock() {
		System.out.println("A. StaticBlock() 디폴트 생성자");
	}
	
	/*
	 * static block(클래스 loading시 단 한번 실행)
	 */
	static {
		System.out.println("1. static block 실행 start");
		StaticBlock sb = new StaticBlock();
		System.out.println("2. static block 실행 end");
	}
}
