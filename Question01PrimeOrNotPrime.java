package Quiz01;

import java.util.Scanner;
public class Question01PrimeOrNotPrime {
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
	    System.out.print("N = ");
	    int n = input.nextInt();
	      int numbers = 1;
	      int num = 3;
	      System.out.println();
	      if (n >= 1){
	         System.out.print(2);
	      }
	      
	      int i = 2;
	      while(i<=n){
	         for (int j = 2 ; j <= Math.sqrt(num) ; j++){
	            if (num%j == 0){
	               numbers = 0;
	               break;
	            }
	         }
	         if (numbers != 0){
	            System.out.print("," + " " + num);
	            i++;
	         }
	         numbers = 1;
	         num++;
	      }
	      input.close();
    }
}
