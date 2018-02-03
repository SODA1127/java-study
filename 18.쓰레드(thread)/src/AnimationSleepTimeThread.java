
public class AnimationSleepTimeThread extends Thread{
	@Override
	public void run() {
		String firstImage = "☞(^_^)☞";
		String secondImage = "☜(^_^)☜";
		boolean turn = true;
		
		String drawImage = firstImage;
		while (true) {
			if(turn){
				drawImage = firstImage;
			}else{
				drawImage = secondImage;
			}
			turn = !turn;
			System.out.println(drawImage);
			
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}
