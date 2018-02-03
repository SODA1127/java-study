public class CarArrayMain {
	public static void main(String[] args) {
		Car[] carArray = {
			null, null, new Car("5908", 9), new Car("7282", 12), null,
			null, null, new Car("3721", 11), null, null,
			null, null, new Car("3456", 10), null, null,
			null, null, null, null, null,
			null, null, null, null, new Car("1345", 12)
		};
		System.out.println("1. 주차공간수 : " + carArray.length);
		System.out.println("2. 주차차량수 : ");
		int carCount = 0;
		for (int i = 0; i < carArray.length; i++) {
			if(carArray[i] != null){
				carCount ++;
			}
		}
		System.out.println(">> "  + carCount + "대 주차 중 …");
		
		System.out.println("3. 4567번 차량 15시 입차");
		Car inCar = new Car("4567", 15);
		for (int i = 0; i < carArray.length; i++) {
			if(carArray[i] == null){
				carArray[i] = inCar;
				carCount ++;
				break;
			}
		}
		
		System.out.println("4. 5908번 차량 한대 찾아서 정보 출력");
		for (int i = 0; i < carArray.length; i++) {
			if(carArray[i] != null){
				if(carArray[i].getNo().equals("5908")){
					carArray[i].printInfo();
					break;
				}
			}
		}
		
		System.out.println("4. 5908번 차량 한대 찾아서 정보 출력(static function)");
		Car.findByNo("1345", carArray);
		Car.findByNo("5908", carArray);
		
		
		System.out.println("5. 입차시간 10시이후 차량들 찾아서 정보 출력");
		for (int i = 0; i < carArray.length; i++) {
			if(carArray[i] != null){
				if(carArray[i].getInTime() >= 10){
					carArray[i].printInfo();
					System.out.println("-------------------------------");
				}
			}
		}
		
		System.out.println("6. 전체차량 정보 출력");
		for (int i = 0; i < carArray.length; i++) {
			if(carArray[i] != null){
				carArray[i].printInfo();
				System.out.println("-------------------------------");
			}
		}
		
		System.out.println("7. 1345차량 찾아 17시에 출차 & 출차 차량 정보 출력");
		for (int i = 0; i < carArray.length; i++) {
			if(carArray[i] != null){
				if(carArray[i].getNo().equals("1345")){
					carArray[i].setOuttime(17);
					carArray[i].calculateFee();
					carArray[i].print();
					carArray[i] = null;
					break;
				}
			}
		}
		
		for (int i = 0; i < carArray.length; i++) {
			if(carArray[i] != null){
			carArray[i].printInfo();
			System.out.println("-------------------------------");
			}
		}
		
	}
}
