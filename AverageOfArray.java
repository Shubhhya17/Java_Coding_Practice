package Arrays;

import java.util.*;

public class AverageOfArray {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.println("Enter the length of array:");
		int length= input.nextInt();
		System.out.println("Enter the " + length+ " elements:");
		int[] arr= new int[length];
		for(int i=0;i<length;i++) {
			arr[i]=input.nextInt();
		}
		for(int i=0;i<length;i++) {
			arr[i]=arr[i]/2;
		}
		System.out.println("The Average of every element in array is : " +Arrays.toString(arr));
		input.close();

	}

}
