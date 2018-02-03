
public class Engine {
	// Engine 타입
	private String type;
	// 엔진 배기량
	private int cc;
	
	public Engine(){
		
	}
	
	public Engine(String type, int cc) {
		this.type = type;
		this.cc = cc;
	}

	public void print() {
		System.out.print(type + " \t " + cc);
	}

	public String getType() {
		return type;
	}

	public int getCc() {
		return cc;
	}

	public void setType(String type) {
		this.type = type;
	}

	public void setCc(int cc) {
		this.cc = cc;
	}
	
}
