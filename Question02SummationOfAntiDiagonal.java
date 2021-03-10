package Quiz01;

import java.util.Scanner;
public class Question02SummationOfAntiDiagonal {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter number of rows and columns: ");
		int row = input.nextInt();
		int column = input.nextInt();
		
		int [][] rc = new int [row][column];
		
		System.out.println();
		System.out.println("Enter Matrix Elements: ");
		for(int i = 0; i<row; i++) {
			for(int j = 0; j<column; j++){
				rc[i][j] = input.nextInt();			
			}
		}
		
		System.out.println();
		int sumAD = 0;
		for(int i = 0; i<row; i++) {
			for(int j = 0; j<column; j++){
				if(((i+j) == row-1) || ((i+j) == column-1)) {
					sumAD += rc[i][j];
				}
			}
		}
		System.out.println("Summation" + " = " + sumAD);
		
		input.close();
	}

}
