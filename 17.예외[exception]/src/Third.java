import javax.xml.ws.handler.MessageContext;


public class Third {
	public void c() throws Exception {
		System.out.println(" \t\t c실행1");
		System.out.println(" \t\t c실행2");
		System.out.println(" \t\t c실행3");
		/*
		 * 예외 발생
		 */
		Exception e = new Exception("애로사항 발생!");
		boolean condition = true;
		if(condition){
			System.out.println("[예외발생]");
			throw e;
		}
		else{
			System.out.println("정상흐름");
		}
		System.out.println(" \t\t c실행4");
		System.out.println(" \t\t c실행5");
		
		System.out.println(" \t\t c반환");
	}
}
