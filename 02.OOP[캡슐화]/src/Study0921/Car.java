package Study0921;
/*
 * class 선언
 *  - 형식
 *       접근제한자  class  클래스이름{
 *       	- 접근제한자:public,protected,없는거
 *       
 *       } 
 *       ex> public class Car{
 *           }
 *           
 *  -구성요소
 *     1.멤버변수선언(속성)
 *        접근제한자(public,proected,없는거,private) 타입 indentifier;
 *        ex> public String carName;
 *        
 *     2.멤버메쏘드 선언(행위)    
 *        접근제한자 리턴타입 메쏘드이름(인자){
 *           -인자(변수선언): 나를 호출한놈이 데이타를 넣어줄 통로
 *        	 -리턴타입: 나를 호출한놈에게 줄 데이타타입 
 *                     void --> 줄데이타가 없는경우
 *        }
 *        ex> public int test(int a, int b){ //지역변수
 *        	  	
 *            }
 *            
 *            public void print(){
 *            		
 *            }
 */

public class Car {
	public static int parking_count = 30;
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
	public void headerprint(){
		System.out.println("----------- " + this.no + " 차량 영수증 ------------");
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
	
	
	
}


