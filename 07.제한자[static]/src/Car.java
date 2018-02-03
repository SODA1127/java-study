
public class Car {
	public static int count = 10;
	
	private String model; // 차량 모델
	private String color; // 차량 색상
	
	public Car(String model, String color) {
		count ++; //Car.count++;
		this.model = model;
		this.color = color;
	}
	
	public void print(){
		System.out.println(model + " \t" + color);
	}
	
}
