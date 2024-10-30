package Arrays;

import java.util.*;

public class SecondLargestandSmallest {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.println("Enter the length of array:");
		int length= input.nextInt();
		System.out.println("Enter the " + length+ " elements:");
		int[] arr= new int[length];
		for(int i=0;i<length;i++) {
			arr[i]=input.nextInt();
		}
		System.out.println("The Original array is : " +Arrays.toString(arr));
		Arrays.sort(arr);  
		System.out.println("The Shorted array is : " +Arrays.toString(arr));
		int min =arr[1];
		int max=arr[length-2];
		System.out.println("The second largest number in an array is : " +max);
		System.out.println("The second smallest number in an array is : " +min);
		input.close();
	}

}
