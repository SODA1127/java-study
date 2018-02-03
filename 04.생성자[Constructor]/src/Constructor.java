/*
생성자(constructor)
1. 클래스 이름과동일하며 리턴타입을 명시하지않는 메쏘드(???)
2. 하나의 클래스에는 반드시 하나이상의 생성자가 존재하여야한다
--> 생성자를 정의하지않을경우 컴파일러는 인자가하나도없는
    생성자(default 생성자)를 자동으로 넣어서 컴파일한다.    
3. 객체생성시 단한번 호출된다.
4. 주로 객체초기화의 용도로 사용한다.
5. 객체를 생성할려면 반드시 생성자를 호출하여야한다.
	
	-형태: 
	 	public class Test{
	 		//생성자의 정의(선언)
	 	    public Test(){
	 	    }
	 	}
	 	
    -사용: 
           Test t = new Test(); 
	 	   클래스명 참조변수이름 = new 클래스명();
	 	   new 라는 연산자는 반드시 생성자 앞에있어야하며
	 	   이연산자에의해 객체를 생성한다.
*/
public class Constructor {
	private int member1;
	private double member2;
	private char member3;
	private boolean member4;
	private String member5;
	
	/*
	 * 	생성자 메소드의 정의
	 */
	public Constructor() { //default 생성자 - 초기화용도
		System.out.println("Constructor : 기본생성자 실행");
		System.out.println("this : " + this);
		
		this.member1 = 9000;
		this.member2 = 0.2;
		this.member3 = 'A';
		this.member4= true;
		this.member5 = "초기값";
		
	}
	
	/*
	 * 생성자 오버로딩
	 */
	public Constructor(int member1){
		System.out.println("Constructor(int memeber1)");
		System.out.println("this : " + this);
		this.member1 = member1;
		this.member2 = 0.2;
		this.member3 = 'A';
		this.member4= true;
		this.member5 = "초기값";
	}
	
	public Constructor(int member1, double member2, char member3,
			boolean member4, String member5) {
		System.out.println("Constructor(int memeber1, double member2, char member3, boolean member4, String member5)");
		this.member1 = member1;
		this.member2 = member2;
		this.member3 = member3;
		this.member4 = member4;
		this.member5 = member5;
	}

	public void print(){
		System.out.println(member1 + " " + member2 + " " + member3 + " " + member4 + " " + member5);
	}
}
