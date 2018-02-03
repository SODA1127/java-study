package com.itwill.lang;

public class StringMain {

	public static void main(String[] args) {
		/*
		 * String 객체생성
		 */
		
		// 1, 명시적 생성
		String str1  = new String("Java");
		String str2 = new String("Java");
		
		// 2. 묵시적 생성
		String str3 = "Java"; // 큰따음표(Double Quotation)에 의한 객체생성
		String str4 = "Java"; // 리터럴풀(literal full)에서 있다면 같은 주소값을 가짐 str3 == str4
		
		if(str1 != str2){
			System.out.println("str1의 주소와 str2의 주소는 다르다.");
		}
		
		if(str2 != str3){
			System.out.println("str2의 주소와 str3의 주소는 다르다.");
		}
		
		if(str3 == str4){
			System.out.println("str3의 주소와 str4의 주소는 같다.");
		}
		
		if(str3 == "Java"){
			System.out.println("str3의 주소와 \"java\"의 주소는 같다.");
		}
		
		System.out.println("----------------------  String객체의 내용(Char Sequence) ---------------------- ");
		
		if(str1.equals(str2)){
			System.out.println("str1, str2의 내용이 같다.");
		}
		if(str1.equals(str3)){
			System.out.println("str1, str3의 내용이 같다.");
		}
		if(str3.equals(str4)){
			System.out.println("str3, str4의 내용이 같다.");
		}
		if(str1.equals("Java")){
			System.out.println("str1, \"java\"의 주소는 같다.");
		}
		if("Java".equals("Java")){
			System.out.println("\"Java\", \"java\"의 주소는 같다.");
		}
		if(str1.equalsIgnoreCase("java")){
			System.out.println("Java, java는 대소문자에 관계없이 같다.");
		}
		
		
		String a = "김경호";
		String b = "홍경호";
		
		String c = "a";
		String d = "b";
		
		/*String c = "apple";
		String d = "pineapple";*/
		
		int result = a.compareTo(b);
		System.out.println(result);
		
		result = b.compareTo(a);
		System.out.println(result);
		
		result = c.compareTo(d);
		System.out.println(result);
		result = d.compareTo(c);
		System.out.println(result);
		
		String str5 = "Have a nice day!";
		String str6 = "오늘은 목요일 스트링을 배워요";
		
		int length = str5.length();
		System.out.println(length);

		length = str6.length();
		System.out.println(length);
		
		System.out.println("자바가 재미있어요!".length());
		
		System.out.println("------------ null Strring ------------");
		String nullStr = "";
		System.out.println(nullStr.length());
		if(nullStr.equals("")){
			System.out.println("null String 비교");
		}
		
		System.out.println("------------ sub Strring ------------");
		System.out.println("Have a nice day!!!".substring(7));
		System.out.println("Have a nice day!!!".substring(7, 11));
		
		System.out.println("------------ charAt ------------");
		String id = "test#00";
		char fc = id.charAt(0);
		System.out.println(fc);
		System.out.println(id.charAt(id.length() -1 ));
		
		for (int i = 0; i < id.length(); i++) {
			char tempChar = id.charAt(i);
			if(tempChar >= 'a' && tempChar <= 'Z'){
				System.out.println("영문 소문자 찍기 : " + tempChar);
			}
		}
		
		/*
		 * Quiz :
		 *		id 유효성 검증
		 *		- 3글자 이상 8글자 이하
		 *		- 영문대, 소, 숫자 문자로구성
		 *		- 첫글자는 영문이어야함 
		 */
		System.out.println("------------ split ------------");
		String carNo = "1111-3456-7735";
		String[] CarNoArray = carNo.split("-");
		for (int i = 0; i < CarNoArray.length; i++) {
			System.out.print(CarNoArray[i]);
		}
		System.out.println("------------ upper, lower ------------");
		String subject = "Java";
		System.out.println(subject.toLowerCase());
		System.out.println(subject.toUpperCase());
		
		System.out.println("------------ stratWith ------------");
		String fileName = "xxx.gif";
		if(fileName.endsWith(".gif")){
			System.out.println(".gif파일 입니다.");
		}
		
		String[] nameArray = {"김경호", "장경호", "이경호", "이기정", "김성연"};
		for (int i = 0; i < nameArray.length; i++) {
			if(nameArray[i].startsWith("김")){
				System.out.println(nameArray[i]);
			}
		}
		
		System.out.println("------------ char[] -> String ------------");
		char[] ca = {'H', 'E', 'L', 'L', 'O'};
		String cStr = new String(ca);
		System.out.println(cStr);
		
		int i = 345;
		String iStr = i + "";
		System.out.println(iStr);
		
	}

}
