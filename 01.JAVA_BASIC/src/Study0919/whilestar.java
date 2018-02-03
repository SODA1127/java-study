package Study0919;

public class whilestar {

   public static void main(String[] args) {

      int i = 0;// 행의 증가 역활
      int k = 0;// 열의 별표시 경계 역활
      while (i < 11) {
         if (i + 1 < 5) {
            while (i < 5) {
               int j = 0;// 행의 열증가 역활
            /*
                 5를 기준으로 k만큼 빼거나 더할때 j가 그보다 크거나 작을 경우에만 별을 입력
                 별을 입력 받을때 5에서 k만큼 더하거나 뺏을때 j와 값이 같다면 빈별을 입력
             */
               
               
               while (j < 10) {
                  if (j < 5 - k || j > 5 + k) {
                     System.out.print("   ");
                  } else {
                     if (j == 5 + k || j == 5 - k) {
                        System.out.print("☆");
                     } else {
                        System.out.print("★");
                     }
                  }
                  j++;
               } // third while end
               System.out.println();
               i++;
               k++;
            } // second while end
         } // if while end
         else {
            /*
              저렇게 준이유는 k값과 i의 값을 초기화 하지않았다.
             */
            
            
            
            while (i < 11) {
               int j = 11;
               while (j > 0) {
                  if (j < k - 4 || j > 16 - k) {
                     System.out.print("   ");
                  } else {
                     if (j == k - 4 || j == 16 - k) {
                        System.out.print("☆");
                     } else {
                        System.out.print("★");
                     }
                  }
                  j--;
               } // third while end
               System.out.println();
               i++;
               k++;
            } // second while end
         } // else end

      } // first while end

   }// main end

}// class end