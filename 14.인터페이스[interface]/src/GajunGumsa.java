
public class GajunGumsa {
	private GajunOnOff[] gajuns;
	/*****************************/
	private GajunOnOff test;
	public GajunOnOff getTest() {
		return test;
	}
	public void setTest(GajunOnOff test) {
		this.test = test;
	}
	/*****************************/
	
	public GajunOnOff[] getGajuns() {
		return gajuns;
	}

	public void setGajuns(GajunOnOff[] gajuns) {
		this.gajuns = gajuns;
	}
	public void gumsa() {
		if(this.gajuns != null) {
			
			for (int i = 0; i < gajuns.length; i++) {
				this.gajuns[i].on();
				GajunVolume temp =(GajunVolume)gajuns[i];
				temp.up();
				temp.down();
				this.gajuns[i].off();
			}
			
		}else {
			System.out.println("검사할 가전제품이 없어요");
		}
	}
	
}
