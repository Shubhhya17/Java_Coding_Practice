package Arrays;

import java.util.*;

public class SmallestNum {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.println("Enter the length of array:");
		int length= input.nextInt();
		System.out.println("Enter the " + length+ " elements:");
		int[] arr= new int[length];
		for(int i=0;i<length;i++) {
			arr[i]=input.nextInt();
		}
		int t=arr[0];
		for(int i=1;i<length;i++) {
			if(t>arr[i]) {
				t=arr[i];
			}
		}
		System.out.println("The smallest number in an array is : " +t);
		input.close();

	}

}
