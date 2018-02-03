
public class ControlStopThreadMain {
	public static void main(String[] args) throws Exception{
		System.out.println("1. main");
		ControlStopThread cst = new ControlStopThread();
		System.out.println("2. ControlStopThread start");
		cst.start();
		
		System.out.println("3. main stop");
		Thread.sleep(4000);		
		
		System.out.println("4. main -- > ControlStopThread stop");
		/*
		 * The method stop() from the type Thread is deprecated
		 * This method is inherently unsafe
		 */
		//cst.stop();
		cst.setPlay(false);
		System.out.println("5. main return");
	}
}
