package com.itwill.wrapper;

public class WrapperClass유용한메쏘드Main {
	public static void main(String[] args) {
		int i = Integer.parseInt("12232");
		double d = Double.parseDouble("1.14159");
		boolean b = Boolean.parseBoolean("true");

		char[] ca = { 'H', 'E', 'L', 'L', 'O', '!' };
		String str1 = new String(ca, 0, ca.length);

		char[] ca1 = str1.toCharArray();

		String name = "김경호";
		char fc = name.charAt(0);
		System.out.println(fc);

		String str2 = "Hello Java 123 !! #$%^&*";
		for (int j = 0; j < str2.length(); j++) {
			char c = str2.charAt(j);
			int type = Character.getType(c);
			if (type == Character.LOWERCASE_LETTER) {
				System.out.println("소문자:"+c);
			}
			if (type == Character.UPPERCASE_LETTER) {
				System.out.println("대문자:"+c);

			}
			if (type == Character.CURRENCY_SYMBOL) {
				System.out.println("화폐문자:"+c);
			}
			if (type == Character.SPACE_SEPARATOR) {
				System.out.println("공백문자:"+c);

			}
			if (type == Character.LETTER_NUMBER) {
				System.out.println("문자숫자:"+c);

			}
			if (type == Character.DECIMAL_DIGIT_NUMBER) {
				System.out.println("숫자:"+c);

			}
			System.out.println(type);
		}
	}
}
