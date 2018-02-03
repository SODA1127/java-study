public class HourlyEmployee extends Employee {
	private int worksHour; // 일한시간
	private int payPerHour; //시급
	
	
	public HourlyEmployee(int no, String name, int worksHour, int payPerHour) {
		super(no, name);
		this.worksHour = worksHour;
		this.payPerHour = payPerHour;
	}
	
	@Override
	public void print() {
		super.print();
		System.out.println(worksHour + "\t" + payPerHour);
	}


	@Override
	public void calculatePay() {
		this.setPay(this.worksHour * this.payPerHour);
	}
	
	public int getWorksHour(){
		return worksHour;
	}

}
