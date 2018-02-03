
public class CreateBThread extends Thread{
	@Override
	public void run() {
		while (true) {
			System.out.print("B");
		}
	}
}
