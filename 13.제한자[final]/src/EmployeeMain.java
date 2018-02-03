public class EmployeeMain {
	public static void main(String[] args) {
		//Employee[] empArray = new Employee[5];
		
		Employee e1 = new SalaryEmployee(1, "KIM", 24000000);
		Employee e2 = new SalaryEmployee(2, "LEE", 18000000);
		Employee e3 = new SalaryEmployee(3, "SIM", 10000000);
		
		Employee e4 = new HourlyEmployee(4, "HIM", 100, 20000);
		Employee e5 = new HourlyEmployee(5, "PIM", 100, 7000);
		
		Employee[] empArray = new Employee[5];
		empArray[0] = e1;
		empArray[1] = e2;
		empArray[2] = e3;
		empArray[3] = e4;
		empArray[4] = e5;
		
		for (int i = 0; i < empArray.length; i++) {
			empArray[i].calculatePay();
			int tempIncentive = empArray[i].calculateIncentive();
			empArray[i].print();
			System.out.println("인센티브 : " + tempIncentive);
		}
		
	}
}
