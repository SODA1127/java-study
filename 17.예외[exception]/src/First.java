
public class First {
	private Second second = new Second();
	public void a() throws Exception{
		System.out.println("a실행");
		second.b();
		System.out.println("a반환");
	}
}
