package Arrays;

import java.util.*;

public class MedianOfArray {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.println("Enter the length of array:");
		int length= input.nextInt();
		System.out.println("Enter the " + length+ " elements:");
		int[] arr= new int[length];
		for(int i=0;i<length;i++) {
			arr[i]=input.nextInt();
		}
		double med=0;
		if(length%2==0) {
			med=(arr[length / 2 - 1] + arr[length / 2]) / 2.0;
		}
		else {
			med=arr[length / 2];
		}
		System.out.println("The Median of an array is : " +med);
		input.close();
	}

}
