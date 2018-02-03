package basic;

public class ClassLoadingInstanceCreateMain {
	public static void main(String[] args) throws Exception{
		/*
		 * 생성자를 사용하지 않고 객체생성
		 */
		//TestClass ts = new TestClass();
		
		
		/*
		 * 1. class가 메모리위로 loading
		 */
		Class testClass = Class.forName("basic.TestClass");
		/*
		 * 2. class의 디폴트생성자 호출
		 */
		Object newInstance = testClass.newInstance();
	}

}
