package com.itwill.io;

public class A_차엔진타입별로차객체를각각파일에저장Main {

	public static void main(String[] args) {

		Car[] carArray = {
				new Car(1, "k3", new Engine("A", 1500), 4), 
				new Car(2, "k4", new Engine("B", 1800), 4),
				new Car(3, "k5", new Engine("C", 1200), 4), 
				new Car(4, "k6", new Engine("D", 2300), 4),
				new Car(5, "k7", new Engine("E", 5600), 4), 
				new Car(6, "k8", new Engine("A", 5500), 4),
				new Car(7, "k9", new Engine("B", 3300), 4), 
				new Car(8, "k10", new Engine("C", 4400), 4),
				new Car(9, "k11", new Engine("D", 1100), 4), 
				new Car(10, "k12", new Engine("F", 8500), 4)
		};
		
		/*
		 * Engine type(A,B,C)별로 차객체를 파일(a_type_car.ser,a_type_car.ser)에 저장하시요
		 */

	}

}
