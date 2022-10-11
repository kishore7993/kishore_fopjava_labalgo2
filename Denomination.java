package pakage.com.lab2;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Denomination {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("enter the size of currency denomination:");
		int size = sc.nextInt();
		System.out.println("enter the denominations");
		Integer [] denominations = new Integer[size];
		for(int i=0;i<size;i++) {
			denominations[i]=sc.nextInt();
			
		}
		Arrays.sort(denominations, Collections.reverseOrder());
		System.out.println("enter the amount:");
		int amount =sc.nextInt();
		sc.close();
		int i=0;
		int [] currencycount=new int[size];
		while(amount>0) {
			currencycount[i]=amount/denominations[i];
			amount= amount-(currencycount[i]*denominations[i]);
			i++;
		}
		for(int j=0; j<size;j++) {
			
			System.out.println(denominations[j]+":"+currencycount[j]);
			
		}
		
		// TODO Auto-generated method stub

	}

}
