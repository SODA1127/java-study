
public class CreateAB가나Main {

	public static void main(String[] args) {
		System.out.println("1. main start");
		CreateAThread at = new CreateAThread();
		CreateBThread bt = new CreateBThread();
		Create가Thread gat = new Create가Thread();
		Create나Thread nat = new Create나Thread();
		
		at.start();
		bt.start();
		gat.start();
		nat.start();
		
		System.out.println("2. main return");
	}

}
