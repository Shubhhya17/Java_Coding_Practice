package Arrays;

import java.util.*;

public class ReverseArray {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.println("Enter the length of array:");
		int length= input.nextInt();
		System.out.println("Enter the " + length+ " elements:");
		int[] arr= new int[length];
		for(int i=0;i<length;i++) {
			arr[i]=input.nextInt();
		}
		int[] arr1=new int[length];
		int l=length-1;
		for(int i=0;i<length;i++) {
			arr1[l] = arr[i];
			l--;
		}
		System.out.println("The Reverse Order of array is : " + Arrays.toString(arr1));
		input.close();
	}

}
