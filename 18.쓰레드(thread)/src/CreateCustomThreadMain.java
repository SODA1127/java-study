/*
  		3. Thread 객체를 생성한다.
		4. Thread를 생성 --> 시작시킨다.
 */
public class CreateCustomThreadMain {

	public static void main(String[] args) {
		System.out.println("1. main start");
		CreateCustomThread cct = new CreateCustomThread();
		/*
		 public void start()
		 Causes this thread to begin execution;
		 the Java Virtual Machine calls the run method of this thread.
		 */
		cct.start();
		System.out.println("2. main return");
		/*while (true) {
			System.out.println("3. main");
		}*/
	}

}
