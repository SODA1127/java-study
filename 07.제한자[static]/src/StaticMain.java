
public class StaticMain {
	public static void main(String[] args) {
		/*
		 * static context  접근방법
		 * - 클래스이름.정적멤버 변수(메소드)
		 */
		System.out.println();
		Static.static_var = 9090;
		System.out.println(Static.static_var);
		Static.static_method();
		
		Static st1 = new Static();
		st1.instance_var = 999;
		st1.instance_method();
		
		Static st2 = new Static();
		st2.instance_var = 888;
		st2.instance_method();
		
		System.out.println("---------- 참조변수를 사영한 static 멤버 접근 -----------");
		/*
		 * The static field Static.static_var should be accessed in a static way
		 */
		st1.static_var = 111; // 공용변수이기 떄문에 접근하는 변수가 같음
		st2.static_var = 222;
		System.out.println(st1.static_var);
		System.out.println(st2.static_var);
		
	}
	
	
}
