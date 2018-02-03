
public class GajunFactoryMain {

	public static void main(String[] args) {
		System.out.println("------------가전제품공장-------------");
		GajunTV tv1=new GajunTV();
		GajunTV tv2=new GajunTV();
		GajunMp3 mp1=new GajunMp3();
		GajunMp3 mp2=new GajunMp3();
		GajunAudio a1=new GajunAudio();
		GajunAudio a2=new GajunAudio();
		GajunAudio a3=new GajunAudio();
		
		GajunOnOff[] gajunArray =new GajunOnOff[7];
		gajunArray[0]=tv1;
		gajunArray[1]=tv2;
		gajunArray[2]=mp1;
		gajunArray[3]=mp2;
		gajunArray[4]=a1;
		gajunArray[5]=a2;
		gajunArray[6]=a3;
		
		
		System.out.println("------------가전제품검사소-------------");
		/*
		GajunOnOff[] recvGajunArray = gajunArray;
		
		for (int i = 0; i < recvGajunArray.length; i++) {
			recvGajunArray[i].on();
			GajunVolume tempGajun = (GajunVolume)recvGajunArray[i];
			tempGajun.up();
			tempGajun.down();
			recvGajunArray[i].off();
			System.out.println("--------출고--------");
		}
		*/
		GajunGumsa gg=new GajunGumsa();
		gg.gumsa();
		gg.setGajuns(gajunArray);
		gg.gumsa();
		
		/*
		public void setTest(GajunOnOff test) {
		*/
		gg.setTest(a1);
		/*
		public GajunOnOff getTest();
		 */
		GajunOnOff tt = gg.getTest();
		gg.setTest(mp1);
		gg.setTest(tv1);
		

	}

}













