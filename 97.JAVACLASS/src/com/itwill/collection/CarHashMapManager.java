package com.itwill.collection;

import java.util.HashMap;

/*
 * 차량객체들을 멤버로 가지고
 * 주차업무수행클래스
 * 
 */
public class CarHashMapManager {
   
   private HashMap carMap;
   
   public CarHashMapManager() {
      carMap=new HashMap();
   }
   
   
   /*
    * 차객체참조변수인자로받아서 입차
    */
   
   public void ipCha(Car inCar) {
      
      
      
   }
   /*
    * 차량번호 와 출차시간받아서 출차
    */
   public void chulCha(String no,int outTime) {
      /*
       * 1. 차량번호로 차객체주소 찾기
       * 2. 출차시간대입후 요금계산
       * 3. 영수증출력
       * 4. 차량제거
       */
      
   }
   
   
   /*
    * 차량번호인자로받아서 차객체 1개 주소 반환
    */
   public Car findByNo(String no) {
      Car findCar=null;
      
      return findCar;
   }
   
   /*
    * 전체차량 출력
    */
   public void print() {
      Car.headerprint();
      
      
   }
   /*
    * 주차차량수반환
    */
   public int getCarCount() {
      int count=0;
      
      return count;
   }
   
   
   
   
}