package com.itwill.collection;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class HashMapMain {

	public static void main(String[] args) {
		HashMap carMap = new HashMap();
		int size = carMap.size();
		System.out.println(">> map size : " + size);
		System.out.println("------------------- put -------------------");
		Car c1 = new Car("1111", 12);
		carMap.put("1111", c1);
		carMap.put("2222", new Car("2222", 13));
		carMap.put("3333", new Car("3333", 13));
		carMap.put("4444", new Car("4444", 13));
		carMap.put("5555", new Car("5555", 13));
		carMap.put("6666", new Car("6666", 13));
		System.out.println(">> before same key map size : " + carMap.size());
		carMap.put("4444", new Car("사사사사", 9));
		System.out.println(">> after same key map size : " + carMap.size());
		System.out.println(">> map : " + carMap);
		
		System.out.println("------------------- get -------------------");
		Car getCar = (Car)carMap.get("3333");
		System.out.println(getCar);
		getCar = (Car)carMap.get("4444");
		System.out.println(getCar);
		
		
		System.out.println("------------------- remove -------------------");
		Car removeCar = (Car)carMap.remove("1111");
		
		removeCar = (Car)carMap.remove("0000");
		if(removeCar == null){
			System.out.println("0000 번호 존재 안함");
		}
		System.out.println("------------------- remove -------------------");
		if(carMap.containsKey("4444")){
			removeCar = (Car)carMap.remove("4444");
			System.out.println(">> map : " + carMap);
		}
		
		System.out.println("------------------- clear() --> isEmpty() -------------------");
		//carMap.clear();
		
		System.out.println("---------------------------------------");
		if(carMap.isEmpty()){
			System.out.println(">> map size : " + carMap.size());
		}
		
		System.out.println("------------------- Iteration -------------------");
		// map의 set --> entrySet(key, value의 객체)
		Set keySet = carMap.keySet();
		Iterator keyset = keySet.iterator();
		while (keyset.hasNext()) {
			String tempKey = (String) keyset.next();
			Car tempCar = (Car)carMap.get(tempKey);
			tempCar.print();
		}
		
		
	}

}
