
public class MainThreadCalled {
	public void main_called_method(){
		System.out.println("A. " + Thread.currentThread().getName() + " 쓰레드야");
		System.out.println("B. " + Thread.currentThread().getName() + " 쓰레드 return");
		return;
	}
}
