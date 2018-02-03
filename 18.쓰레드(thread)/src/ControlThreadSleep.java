import java.util.Date;


public class ControlThreadSleep extends Thread{
	@Override
	public void run() {
		while (true) {
			Date today = new Date();
			String todayStr = today.toString();
			System.out.println(todayStr);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}
