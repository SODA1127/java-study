public class SalaryEmployee extends Employee {
	private int annualSalary; // 연봉
	
	public SalaryEmployee(int no, String name, int annualSalary) {
		super(no, name);
		this.annualSalary = annualSalary;
	}
	
	@Override
	public void print() {
		super.print();
		System.out.println(annualSalary);
	}

/*
 * final 메소드 오버라이딩은 금지
 	public int calculateIncentive(){
		return 0;
	}
*/
	
	@Override
	public void calculatePay() {
		this.setPay(this.annualSalary/12);
	}
}
