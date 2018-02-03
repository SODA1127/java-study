
public class GajunMp3 implements GajunOnOff,GajunVolume{
	public void mp3_method1() {
		System.out.println("mp3_method1()");
	}
	@Override
	public void up() {
		System.out.println("MP3.up()");
		
	}

	@Override
	public void down() {
		System.out.println("MP3.down()");
		
	}

	@Override
	public void on() {
		System.out.println("MP3.on()");
		
	}

	@Override
	public void off() {
		System.out.println("MP3.off()");
	}
	
}
