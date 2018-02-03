
public class CreateAThread extends Thread{
	@Override
	public void run() {
		while (true) {
			System.out.print("A");
		}
	}
}
