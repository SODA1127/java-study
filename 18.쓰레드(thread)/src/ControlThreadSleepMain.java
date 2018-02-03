
public class ControlThreadSleepMain {
	public static void main(String[] args) throws InterruptedException {
		System.out.println("1. main");
		/*
		public static void sleep(long millis)
                  throws InterruptedException
                  Causes the currently executing thread to sleep
		 */
		/*
		 * slee 메소드를 실행한 스레드를 3초간 sleep
		 */
		System.out.println("2. main 3초간 sleep");
		Thread.sleep(3000);
		System.out.println("3. main 3초간 sleep 후 실행");
		
		System.out.println("4. main ControlThreadSleep객체생성");
		ControlThreadSleep cts = new ControlThreadSleep();
		System.out.println("5. main ControlThreadSleep객체의 스레드생성");
		cts.start();
		System.out.println("6. main");
	}
}
