public class Car {
	public String no; //차량번호
	public int inTime; //입차시간
	public int outtime; //출차시간
	public int fee; //주차요금
	
	
	
	/*
	 *  - 입차시 데이터(차량의 번호, 입차 시간) 차량객체 셋팅
	 *  - 출차시간 세팅
	 *  - 요금 계산
	 *  - 차량의 정보를 출력
	 */
	public Car() {
	}
	
	
	public Car(String no, int inTime) {
		this.no = no;
		this.inTime = inTime;
	}

	/*
	 * 입차시 데이터(차량의 번호, 입차 시간) 차량객체 셋팅
	 */
	public void setIpChaData(String no, int inTime){
		this.no = no;
		this.inTime = inTime;
	}
	
	/*
	 * 출차 시간 세팅
	 */
	public void setOutTime(int outTime){
		this.outtime = outTime;
	}
	
	/*
	 * 요금 계산
	 */
	public void calculateFee(){
		this.fee = (this.outtime - this.inTime) * 1000;
	}
	
	/*
	 * 차량 정보 출력
	 */
	public static void headerprint(){
		System.out.println("-----------  차량 영수증 ------------");
	}
	
	public void printInfo(){
		System.out.println("차량번호 : " + this.no);
		System.out.println("입차시간 : " + this.inTime);
	}
	
	public void print() {
		System.out.println("차량번호 : " + this.no);
		System.out.println("입차시간 : " + this.inTime);
		System.out.println("출차시간 : " + this.outtime);
		System.out.println("주차요금 : " + this.fee);
		System.out.println("-------------------------------------------");
	}

	/*********** getter, setter ************/
	public String getNo() {
		return no;
	}

	public int getInTime() {
		return inTime;
	}

	public int getOuttime() {
		return outtime;
	}

	public int getFee() {
		return fee;
	}

	public void setNo(String no) {
		this.no = no;
	}

	public void setInTime(int inTime) {
		this.inTime = inTime;
	}

	public void setOuttime(int outtime) {
		this.outtime = outtime;
	}

	public void setFee(int fee) {
		this.fee = fee;
	}
	
	public static void findByNo(String no, Car[] carArray){
		for (int i = 0; i < carArray.length; i++) {
			if(carArray[i] != null){
				if(carArray[i].getNo().equals(no)){
					carArray[i].printInfo();
					break;
				}
			}
		}
	}
	
	
}


