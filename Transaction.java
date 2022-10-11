import java.util.Scanner;
public class Transaction {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("enter the size of the array");
		int size = s.nextInt();
		int arr[] = new int[size];
		System.out.println("enter the values of array");
		for(int i=0 ;i<size ;i++)
			arr[i]=s.nextInt();
		System.out.println("enter the total no of targets to be achieved");
		int targetNo = s.nextInt();
		while(targetNo!=0) {
			int flag=0;
			long target;
			System.out.println("enter the value of target");
			target =s.nextInt();
			long sum=0;
			for(int i=0;i<size;i++) {
				sum+=arr[i];
				if(sum>=target) {
					System.out.println("target achieved after "+(i+1)+"transaction");
					flag =1; 
					break;
				}
			}
			if(flag==0) {
				System.out.println("given target is not achieved");
			}
		}
			
		
		
		
		// TODO Auto-generated method stub

	}

}
