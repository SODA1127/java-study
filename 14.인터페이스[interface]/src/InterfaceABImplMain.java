
public class InterfaceABImplMain {

	public static void main(String[] args) {
		System.out.println("------------------InterfaceABImpl------------------");
		InterfaceABImpl abimpl=new InterfaceABImpl();
		abimpl.method1();
		abimpl.method2();
		abimpl.method3();
		abimpl.method4();
		
		Object o=abimpl;
		
		
		System.out.println("------------------InterfaceA------------------");
		InterfaceA ia1 = abimpl;
		ia1.method1();
		ia1.method2();
		/*
		ia1.method3();
		ia1.method4();
		*/
		
		System.out.println("------------------InterfaceB------------------");
		InterfaceB ib1=abimpl;
		/*
		ib1.method1();
		ib1.method2();
		*/
		ib1.method3();
		ib1.method4();
		
		System.out.println("------------InterfaceA<-->InterfaceB-------------");
		InterfaceA ia2=new InterfaceABImpl();
		InterfaceB ib2=(InterfaceB)ia2;
		
		System.out.println("---------array--------------");	
		InterfaceA[] iaa=new InterfaceA[2];
		iaa[0]=new InterfaceABImpl(); 
		iaa[1]=new InterfaceABImpl();
		
		/*
		InterfaceB[] iba=new InterfaceB[2];
		iba[0] = new InterfaceABImpl();
		iba[1] = new InterfaceABImpl();
		*/
		
		for (int i = 0; i < iaa.length; i++) {
			iaa[i].method1();
			iaa[i].method2();
			
			InterfaceB tempib=(InterfaceB)iaa[i];
			tempib.method3();
			tempib.method4();
			
		}
		
		
		
		
	}

}
