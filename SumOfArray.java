package Arrays;

import java.util.*;

public class SumOfArray {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.println("Enter the length of array:");
		int length= input.nextInt();
		System.out.println("Enter the " + length+ " elements:");
		int[] arr= new int[length];
		for(int i=0;i<length;i++) {
			arr[i]=input.nextInt();
		}
		int sum=0;
		for(int i=0;i<length;i++) {
			sum+=arr[i];
		}
		System.out.println("The Sum of an array is : " +sum);
		input.close();

	}

}
