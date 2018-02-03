public abstract class Employee {
	private int no;
	private String name;
	private int pay; //급여
	
	
	public Employee(int no, String name) {
		super();
		this.no = no;
		this.name = name;
	}
	/*
	 * 급여계산 - 모든 자식객체에서 반드시 구현해야하는 메소드(Overriding - 재정의를 강제)
	 */
	
	public abstract void calculatePay();
	
	public void print(){
		System.out.print(no + "\t" + name + "\t" + pay + "\t");
	}
	
	public int getNo() {
		return no;
	}

	public String getName() {
		return name;
	}

	public int getPay() {
		return pay;
	}

	public void setNo(int no) {
		this.no = no;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setPay(int pay) {
		this.pay = pay;
	}
	
	
}
