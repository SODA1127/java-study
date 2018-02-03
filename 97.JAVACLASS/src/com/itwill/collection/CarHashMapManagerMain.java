package com.itwill.collection;

public class CarHashMapManagerMain {

   public static void main(String[] args) {
      CarHashMapManager  carManager=new CarHashMapManager();
      /*
       *  입차
       *  매니져야 차객체참조변수인자로줄께 입차시켜줘
       */
      Car inCar1=new Car("3452", 12);
      carManager.ipCha(inCar1);
      Car inCar2=new Car("2348", 13);
      carManager.ipCha(inCar2);
      
      /*
       * 매니져야 차량번호줄께 차객체 1개 주소 반환해줘
       */
      System.out.println(">>carManager.findByNo(\"XXXX\")");
      Car fCar=carManager.findByNo("2348");
      fCar.print();
      
      /*
       * 매니져야 남은주차장수반환해줘
       */
      int pCount = carManager.getCarCount();
      System.out.println(">>주차된차량수:"+pCount);
      
      /*
       * 매니져야 차량번호 와 출차시간 인자로줄께 출차시켜줘
       */
      carManager.chulCha("2348", 17);
      carManager.print();
      
      /*
       * 출차-->영수증출력
       */
      
      

   }

}