
public class CarFactoryMain {
	public static void main(String[] args) {
		Car.count = 100;
		
		System.out.println("1. Car.count 초기값 : " + Car.count);
		
		Car c1 = new Car("K3", "BLACK");
		Car c2 = new Car("K5", "RED");
		System.out.println("2. 차량 총생산 : " + Car.count);
		Car c3 = new Car("K7", "YELLOW");
		
		System.out.println("2. 차량 총생산 : " + Car.count);
		System.out.println("2. 차량 총생산 c1.count : " + c1.count);
		System.out.println("2. 차량 총생산 c2.count : " +c2.count);
		System.out.println("2. 차량 총생산 c3.count : " + c3.count);
	}
}
