
public class Print {
	
	
	/*******************************/
/*	public void intPrintln(int i){
		System.out.println("int println : " + i);
	}
	public void charPrintln(char c){
		System.out.println("char println : " + c);
	}
	public void StringPrintln(String s){
		System.out.println("Stirng println : " + s);
	}
	public void booleanPrintln(boolean b){
		System.out.println("boolean println : " + b);
	}
	public void doublePrintln(double b){
		System.out.println("double println : " + b);
	}*/
	
	
	/********** 오버로딩 ***********/
	public void println(int i){
		System.out.println("int print : " + i);
	}
	public void println(char c){
		System.out.println("char print : " + c);
	}
	public void println(String s){
		System.out.println("Stirng print : " + s);
	}
	public void println(boolean b){
		System.out.println("boolean print : " + b);
	}
	public void println(double b){
		System.out.println("double print : " + b);
	}
}
