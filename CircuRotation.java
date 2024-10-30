package Arrays;

import java.util.*;

public class CircuRotation {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.println("Enter the length of array:");
		int length= input.nextInt();
		System.out.println("Enter the " + length+ " elements:");
		int[] arr= new int[length];
		for(int i=0;i<length;i++) {
			arr[i]=input.nextInt();
		}
		System.out.println("Enter Number Of Elements Rotate: ");
		int k= input.nextInt();
		System.out.println("The Original Array Is: " +Arrays.toString(arr));
		int[] arr1= new int[length];
		int count=0;
		for(int i=k; i<length;i++) {
			arr1[count]=arr[i];
			count++;
		}
		int x=length;
		for(int i=0;i<k;i++) {
			arr1[x-1]=arr[i];
			x--;
		}
		System.out.println("The New Circular Rotate Array Is: " +Arrays.toString(arr1));
		input.close();
	}

}
