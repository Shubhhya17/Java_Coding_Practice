package Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class RotateArray {
	public void rotate(int k, int[] arr, int length, String d) {
		if(d=="L") {
			if(k==0 || k>=length) return;
			k = k % length; // In case k is larger than length
			int[] arr1=new int[length];
			for (int i = 0; i < length - k; i++) {
	            arr1[i] = arr[i + k];
	        }
			for (int i = 0; i < k; i++) {
	            arr1[length - k + i] = arr[i];
			}
			System.out.println("The Rotate Left Array is: " +Arrays.toString(arr1));
		}else {
			if(k==0 || k>=length) return;
			k = k % length; // In case k is larger than length
			int[] arr1=new int[length];
			for (int i = 0; i < k; i++) {
	            arr1[i] = arr[length - k + i];
	        }
			 for (int i = 0; i < length - k; i++) {
		            arr1[i + k] = arr[i];
		     }
			 System.out.println("The Rotate Right Array is: " +Arrays.toString(arr1));
		}
	}
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.println("Enter the length of array:");
		int length= input.nextInt();
		System.out.println("Enter the " + length+ " elements:");
		int[] arr= new int[length];
		for(int i=0;i<length;i++) {
			arr[i]=input.nextInt();
		}
		System.out.println("Enter a number to rotate: ");
		int k=input.nextInt();
		System.out.println("Enter direction to rotate (L or R): ");
		String d= input.next();
		RotateArray obj= new RotateArray();
		obj.rotate(k,arr, length, d);
		input.close();

	}

}
