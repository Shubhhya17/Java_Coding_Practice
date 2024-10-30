package Arrays;

import java.util.*;

public class largestNum {

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
		int t=arr[0];
		for(int i=1;i<length;i++) {
			if(t<arr[i]) {
				t=arr[i];
			}
		}
		System.out.println("The largest number in an array is : " +t);
		input.close();
	}

}
