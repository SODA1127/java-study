
public class CreateMessageThread extends Thread{
	private String message;
	public CreateMessageThread(String message) {
		this.message = message;
	}
	
	@Override
	public void run() {
		while (true) {
			System.out.print(message);
		}
	}
}
