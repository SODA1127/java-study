
public class Second {
	private Third third = new Third();
	public void b() throws Exception {
		System.out.println(" \t b실행");
		third.c();
		System.out.println(" \t b반환");
	}
}
