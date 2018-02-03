
public class ControlStopThread extends Thread{
	private boolean isPlay;
	private int count;

	public ControlStopThread() {
		isPlay = true;
		count = 0;
	}
	
	public boolean isPlay() { //getPlay
		return isPlay;
	}

	public void setPlay(boolean isPlay) {
		this.isPlay = isPlay;
	}

	@Override
	public void run() {
		while (isPlay) {
			count++;
			System.out.println(count);
			
			System.out.println("------ 이체 ------");
			System.out.println("1. A계좌 출금");
			System.out.println("2. B계좌 입금");
			System.out.println("------------------");
			
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
	
	
}
