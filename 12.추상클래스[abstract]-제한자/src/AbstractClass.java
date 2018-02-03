/*
추상클래스
  1.정의: 
  		- 하나 이상의 추상메소드가 정의되어있는 클래스
  		- 추상메소드가 없으나 객체 생성을 금지하고자할 때 사용하는 방법
     ex> public abstract class Test{
         	//추상메쏘드();
         	public abstract int print(int i);
         	//일반메쏘드();
         	public void test(){
         	}
         }
         ==>추상메쏘드: 메쏘드의 구현부분이 없고 원형(prototype)
                         만 존재하는 메쏘드
            ex> public abstract int print(int i);             
  2. 추상클래스는 불완전한 추상메쏘드를 가지므로 객체생성이 불가능하다.
      Test t=new Test();(X)
  3. 추상클래스는 추상클래스를 상속받아서 추상메쏘드를 
     구현(오버라이딩)하는 자식 클래스를 만들어 
     사용(객체생성)해야한다 
*/

public abstract class AbstractClass {
	public void method1(){
		System.out.println("난 구현된 메소드");
	}
	public abstract void method2();
}
