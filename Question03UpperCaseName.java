package Quiz01;

import java.util.Scanner;
public class Question03UpperCaseName {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Insert name: ");
		String onename = input.nextLine();
		System.out.print("Insert name: ");
		String twoname = input.nextLine();
		
		String [] nameone = onename.split(" ");
		String [] nametwo = twoname.split(" ");
		
		int countone = 0;
		String finalnameone = "";
		for(int i=0; i<nameone.length; i++) {
			if(nameone[i].charAt(0) >= 65 && nameone[i].charAt(0) <= 90) {
				finalnameone += nameone[i].charAt(0);
				countone++;
			}
		}
		System.out.print(countone + " - " + finalnameone);
		
		System.out.println();
		int counttwo = 0;
		String finalnametwo = "";
		for(int i=0; i<nametwo.length; i++) {
			if(nametwo[i].charAt(0) >= 65 && nametwo[i].charAt(0) <= 90) {
				finalnametwo += nametwo[i].charAt(0);
				counttwo++;
			}
		}
		System.out.print(counttwo + " - " + finalnametwo);
	
		input.close();
	}

}
