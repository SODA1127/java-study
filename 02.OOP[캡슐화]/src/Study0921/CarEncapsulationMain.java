package Study0921;

public class CarEncapsulationMain {
	public static void main(String[] args) {
		System.out.println("주차구획수 : "  + Car.parking_count);
		
		Car c1 = new Car();
		Car c2 = new Car();
		
		c1.setIpChaData("1234", 12);
		c2.setIpChaData("4567", 13);
		
		//3시간 후
		c1.setOutTime(15);
		//2시간 후
		c2.setOutTime(15);
		c1.calculateFee();
		c2.calculateFee();
		
		c1.headerprint();
		c1.print();
		c2.print();
		
		//c2차량의 주차요금
		System.out.println("c2 차량의 주차요금 : " + c2.getFee());
	}
}
