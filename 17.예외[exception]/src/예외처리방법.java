
public class 예외처리방법 {
	/*
	예외:
	  1. Exception : MILD Error(처리대상)
	  2. Error     : Error
	  
	  * Exception 종류
	   		1. RuntimeException    :처리하지않아도 된다(자동처리 된다)
	   		    ==>프로그래머의 실수로인한 Exception 
	   		    ex> NullPointerException,ArrayIndexOutOfBoundsException
	        2. 비 RuntimeException :반드시 처리해야한다.
	        	==>프로그램과관계 없이 일어날 가능성이 있는 Exception
	  			ex> network,io,db,file

	  *처리방법
	     ex1>잡는다.
	     public void method(){
		 	
		     try{ 
		     
		     	익셉션 발생예상코드;
		     	
			 }catch(Exception클래스 e){
			 	익셉션 발생예상코드에서 Exception이발생하면
			 	실행하게될코드;
			 }
		 }
		 ex2> 던진다.
		 
		 	public void method()throws Exception {
		 	
		 		익셉션 발생예상코드;
		 	
		 	}
	*/
}
