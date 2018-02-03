
public class CarFactoryMain {
	public static void main(String[] args) {
		Engine e1 = new Engine("A", 1500);
		Engine e2 = new Engine("C", 2500);
		System.out.println("------------------------------------------------");
		
		
		Car car1 = new Car();
		car1.setNo(1234);
		car1.setModel("MATIZ");
		car1.setWheelNumber(4);
		
		car1.setEngine(e1);
		
		Car car2 = new Car(8989, "SM7", e2, 4);
		car1.print();
		car2.print();
	}
}
