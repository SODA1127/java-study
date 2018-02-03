
public class MainThreadMain {

	public static void main(String[] args) {
		System.out.println("main start");
		
		Thread currentThread = Thread.currentThread();
		String currentThreadName = currentThread.getName();
		System.out.println("current thread name : " + currentThreadName);
		System.out.println("********** 메인 쓰레드 메소드 호출 **********");
		
		MainThreadCalled mtc = new MainThreadCalled();
		System.out.println("1. main 쓰레드 호출");
		mtc.main_called_method();
		System.out.println("2. main 쓰레드 호출");
		
		System.out.println("main return");
		return;
	}

}
