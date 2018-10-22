import java.util.Scanner;

public class RepeatedDigits {
	
	// problem #3 from chapter #5
	// problem #4 from Chapter #5 ----> while part
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a number: ");
		int num = input.nextInt();
		
		while(num>0) {
		int [] table = {0,1,2,3,4,5,6,7,8,9};
		printArray(table);
		System.out.println(" ");
		printArray(tableCount(num));
		System.out.println();
		System.out.print("Enter a number: ");
		 num = input.nextInt();
		}
		
	}

	 public static void printArray(int [] arr) {
		 for(int i=0;i<arr.length;i++) {
			 System.out.print(arr[i]+" ");
			}
		
	 }
	 public static int [] tableCount(int number) {
		 int []tableCount = new int [10];
			while(number!=0) {
				tableCount[number%10]=tableCount[number%10]+1;
				number=number/10;
			}
		 return tableCount;
	 }
	 

}
