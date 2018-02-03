
public class ObjectInitializeMain {

	public static void main(String[] args) {
		ObjectInitialize oi = new ObjectInitialize();
		System.out.println(oi.member1);
		System.out.println(oi.member2);
		System.out.println(oi.member3);
		System.out.println(oi.member4);
		System.out.println(oi.member5);
		System.out.println("------------------------");
		System.out.println(oi.member11);
		System.out.println(oi.member22);
		System.out.println(oi.member33);
		System.out.println(oi.member44);
		System.out.println(oi.member55);
		
		/*
		 * 객체주소 리터럴(null)
		 * 		- 주소없다의 주소값
		 */
		
		/*
		 * 로컬변수
		 * 		- 로컬변수는 반드시 초기화(사용하기전) 되어야한다.
		 */
		int i = 0;
		ObjectInitialize oi2 = null;
		System.out.println(i);
		System.out.println(oi2);
		
		if(oi2 == null){
			System.out.println(true);
			oi2 = new ObjectInitialize();
		}
		System.out.println(oi2.member1);
		
		ObjectInitialize[] oiArray = new ObjectInitialize[10];
		for (int j = 0; j < oiArray.length; j++) {
			System.out.println(oiArray[i]);
		}
	}

}
