
public class FinalClassChild extends FinalClass{
	/*
	Overriding시 에러 발생(상속은 됨)
	public void method2() {
	}*/
	
	@Override
	public void method3() {
		System.out.println("method3() Overriding");
	}
}
