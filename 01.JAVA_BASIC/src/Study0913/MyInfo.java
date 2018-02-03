/* - 9월 13일 숙제 -
- 클래스이름: MyInfo
- 클래스기능: 나의정보출력
- 클래스 구성요소:main 메쏘드
 
  메인메쏘드를 정의한후 
  나의정보를 화면에
  출력하는 코드를 작성하시요 
*/

package Study0913;

public class MyInfo {

	public static void main(String[] args) {
		String name = "이기정";
		char sex = 'M';
		int age = 20;
		float weight = 65.5f;
		String grade = "High";
		System.out.println("이름 : " + name);
		System.out.println("나이 : " + age);
		System.out.println("성별 : " + sex);
		System.out.println("몸무게 : " + weight + "kg");
		System.out.println("학교 : " + grade + "School");
		
/*		int j=7;
		for (int i = 0; i< j ;i++){
			System.out.println(i);
			age++;
			System.out.println(age);
		}*/
	}
}