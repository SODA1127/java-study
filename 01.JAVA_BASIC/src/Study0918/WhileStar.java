package Study0918;
import java.util.Scanner;

/*
★★★★★
★★★★★
★★★★★
★★★★★
★★★★★
 
☆★★★★
★☆★★★
★★☆★★
★★★☆★
★★★★☆

★
★★
★★★
★★★★
★★★★★

★★★★★
★★★★
★★★
★★
★

★★★★★
  ★★★★
    ★★★
      ★★
        ★
        
☆☆☆☆☆
★☆☆☆☆
★★☆☆☆
★★★☆☆
★★★★☆

 */
public class WhileStar {
	public static void main(String[] args) {
		
		System.out.println("------------------------------------------------");
		int i = 1;
		while(i <= 5){
			int j = 1;
			while(j <= 5){
				System.out.print("★");
				j ++;
			}
			System.out.println();
			i ++;
		}
		System.out.println("------------------------------------------------");
		i = 0;
		while(i < 5){
			int j = 0;
			while(j < 5){
				if(i != j){
					System.out.print("★");
				}
				else{
					System.out.print("☆");
				}
				j ++;
			}
			System.out.println();
			i ++;
		}
		System.out.println("------------------------------------------------");
		i = 1;
		while(i <= 5){
			int j = 1;
			while(j <= i){
				System.out.print("★");
				j ++;
			}
			System.out.println();
			i ++;
		}
		System.out.println("------------------------------------------------");
		i = 5;
		while(i >= 1){
			int j = 1;
			while(j <= i){
				System.out.print("★");
				j ++;
			}
			System.out.println();
			i --;
		}
		System.out.println("------------------------------------------------");
		i = 1;
		while(i <= 5){
			int j = i;
			while(j >= 1){
				System.out.print("   ");
				j --;
			}
			int k = 5;
			while(k >= i){
				System.out.print("★");
				k --;
			}
			System.out.println();
			i ++;
		}
		System.out.println("------------------------------------------------");
		i = 1;
		while(i <= 5){
			int j = i;
			while(j >= 2){
				System.out.print("★");
				j --;
			}
			int k = 5;
			while(k >= i){
				System.out.print("☆");
				k --;
			}
			System.out.println();
			i ++;	
		}
		System.out.println("------------------------------------------------");
		i = 0;
		while(i < 5){
			int j = i;
			while(j < 5){
				System.out.print("   ");
				j ++;
			}
			j = 0;
			while(j < i){
				System.out.print("★");
				j ++;
			}
			j = 0;
			while(j < i -1){
				System.out.print("★");
				j ++;
			}
			i ++;
			System.out.println();
		}
		
		////////////
		System.out.println();
		////////////
		
		i = 0;
		while(i < 5){
			int j = 0;
			while(j < i){
				System.out.print("   ");
				j ++;
			}
			j = i;
			while(j < 5){
				System.out.print("★");
				j ++;
			}
			j = i + 1;
			while(j < 5){
				System.out.print("★");
				j ++;
			}
			i ++;
			System.out.println();
		}
		System.out.println("------------------------------------------------");
		Scanner sc = new Scanner(System.in);
		System.out.print("반지름 값 입력 : ");
		int d = sc.nextInt();
		i = 0;
		while(i < d){
			int j = i;
			while(j < d){
				System.out.print("   ");
				j ++;
			}
			j = 0;
			while(j < i){
				if(j == 0){
					System.out.print("☆");
				}
				else{
					System.out.print("★");
				}
				j ++;
			}
			j = 0;
			while(j < i -1){
				//System.out.println("i : " + i + ", j : " + j);
				if(i == j + 2){
					System.out.print("☆");
				}
				else{
					System.out.print("★");	
				}
				j ++;
			}
			i ++;
			System.out.println();
		}
		
		i = 0;
		while(i < d){
			int j = 0;
			while(j < i){
				System.out.print("   ");
				j ++;
			}
			j = i;
			while(j < d){
					//System.out.println("i : " + i + ", j : " + j);
					if(i == j){
						System.out.print("☆");
					}
					else{
						System.out.print("★");
					}
				j ++;
			}
			j = i + 1;
			while(j < d){
				if(j == d - 1){
					System.out.print("☆");
				}
				else{
					System.out.print("★");
				}
				j ++;
			}
			i ++;
			System.out.println();
		}
		
		
		System.out.println("------------------------------------------------");
		/*for (i = 0; i < 5; i++) {
            for (int j = i; j < 5; j++) {
                System.out.print("   ");
            }
            for (int j = 0; j < i; j++) {
                System.out.print("★");
            }
            for (int j = 0; j < i - 1; j++) {
                System.out.print("★");
            }
            System.out.println();
		}
		
		for (i = 0; i < 5; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print("   ");
            }
            for (int j = i; j < 5; j++) {
                System.out.print("★");
            }
            for (int j = i + 1; j < 5; j++) {
                System.out.print("★");
            }
            System.out.println();
        }*/
	}
}
