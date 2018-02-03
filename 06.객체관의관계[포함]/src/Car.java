
public class Car {
	//차량번호
	private int no;
	
	//차량모델
	private String model;
	
	//엔진
	private Engine engine;
	
	//바퀴수
	private int wheelNumber;
	
	public Car(){
		
	}
	
	public Car(int no, String model, Engine engine, int wheelNumber) {
		super();
		this.no = no;
		this.model = model;
		this.engine = engine;
		this.wheelNumber = wheelNumber;
	}

	public void print(){
		System.out.print(no + " \t " + model + " \t " + wheelNumber + " \t ");
		engine.print();
		System.out.println();
	}

	//setter
	public void setEngine(Engine engine){
		this.engine = engine;
	}

	public void setNo(int no) {
		this.no = no;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public void setWheelNumber(int wheelNumber) {
		this.wheelNumber = wheelNumber;
	}
	
	
	
	//getter
	public int getNo() {
		return no;
	}

	public String getModel() {
		return model;
	}

	public int getWheelNumber() {
		return wheelNumber;
	}
	
}
