
public class CreateMessageThreadMain {

	public static void main(String[] args) {
		CreateMessageThread cmt1 = new CreateMessageThread("김태희");
		CreateMessageThread cmt2 = new CreateMessageThread("이효리");
		CreateMessageThread cmt3 = new CreateMessageThread("정우성");
		cmt1.start();
		cmt2.start();
		cmt3.start();
		
		while(true){
			System.out.println("난 메인");
		}
	}

}
