package ClassStudy;
import java.util.Scanner;

class Car{
	static String name;
	static String findName;
	static int speed;
	static char gear;
	static int people;
	static double weight;
	static int findCount;

	public void setName(String name) {
		this.name = name;
	}
	public void setSpeed(int speed) {
		this.speed = speed;
	}
	public void setGear(char gear) {
		this.gear = gear;
	}
	public void setPeople(int people) {
		this.people = people;
	}
	public void setWeight(int weight) {
		this.weight = weight;
	}
	
	void printCondition(){
		System.out.println("이름 : " + Car.name + " 속도 : "  + Car.speed + " 기어 상태 : " +  Car.gear + " 사람 수 : " + Car.people + "  무게 : " + Car.weight);
	}
	
	public void setFind(String name, String findName){
		this.name = name;
		String space  = " ";
		for(int i = 0; i < name.length(); i++){
            findName += name.charAt(i);
			//초기화
			boolean leftShape = false;
            boolean rightShape = false;
            
            //탐색
            if (i != 0) {
                if (name.charAt(i) < 'A') {
                    leftShape = true;
                }
                else if (name.charAt(i - 1) < 'A') {
                    rightShape = true;
                }
            }
            
            //출력 (만약 앞뒤 글자가 형태가 다를 경우)
            if (leftShape != rightShape) {
                findName += space;
                findCount ++;
            }
		}
	}
	
	public void printFind(){
		int find = findCount - 1;
        if(findCount >= 1){
			System.out.println(find + " 번의 붙여쓰기가 발견되었습니다. 다음 부터는 띄어쓰기 부탁드립니다.");
		}
	}
}

class make{
	void makeCar(){
		
	}
}

public class CarTest {
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		int cars = 0;
		
		System.out.println("만들고 싶은 자동차 수 : ");
		cars = scan.nextInt();
		Car [] car = new Car[cars]; 
		System.out.println("------------자동차 정보 입력------------");
		for(int i=0; i<car.length; i++){
			car[i] = new Car();
			//System.out.println("자동차");
			System.out.println("");
			System.out.println("자동차 이름 : ");
			car[i].setName(scan.next());

			System.out.println("------------------------------------");	
			System.out.println("속도 : ");
			car[i].setSpeed(scan.nextInt());
			System.out.println("------------------------------------");	
			System.out.println("기어 : ");
			car[i].setGear(scan.next().charAt(0));
			System.out.println("------------------------------------");	
			System.out.println("사람 수 : ");
			car[i].setPeople(scan.nextInt());
			System.out.println("------------------------------------");	
			System.out.println("무게 : ");
			car[i].setWeight(scan.nextInt());
			
			int q = i+1;
			System.out.println("총 " + q + "명 입력");
			
			
		}
		System.out.println("------------입력 완료------------");
		for(int i=0; i<car.length; i++){
			car[i].printCondition();
			car[i].printFind();
		}
	}
}

/*Car myCar = new Car();
myCar.name = "내차";
myCar.speed = 120;
myCar.gear = 'S';
myCar.people = 4;
myCar.weight = 500.50;

myCar.printCondition();

Car broCar = new Car();
broCar.name = "오빠차";
broCar.speed = 150;
broCar.gear = 'P';
broCar.people = 1;
broCar.weight = 250.50;

broCar.printCondition();*/
