
public class GajunAudio implements GajunOnOff,GajunVolume{
	
	@Override
	public void up() {
		System.out.println("Audio.up()");
		
	}

	@Override
	public void down() {
		System.out.println("Audio.down()");
		
	}

	@Override
	public void on() {
		System.out.println("Audio.on()");
		
	}

	@Override
	public void off() {
		System.out.println("Audio.off()");
		
	}

}
