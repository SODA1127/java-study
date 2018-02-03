
public class CarConstructorMain {
	public static void main(String[] args) {
		Car car1 = new Car();
		car1.setIpChaData("1111", 12);
		Car car2 = new Car("2222", 13);
		Car car3 = new Car("3333", 14);
		
		car1.setOuttime(16);
		car1.calculateFee();
		
		car2.setOuttime(16);
		car2.calculateFee();
		
		car3.setOuttime(16);
		car3.calculateFee();
		
		car1.headerprint();
		car1.print();
		car2.print();
		car3.print();
		
	}
}
