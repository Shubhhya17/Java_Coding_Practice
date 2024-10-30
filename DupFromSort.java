package Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class DupFromSort {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.println("Enter the length of array:");
		int length= input.nextInt();
		System.out.println("Enter the " + length+ " elements:");
		int[] arr= new int[length];
		for(int i=0;i<length;i++) {
			arr[i]=input.nextInt();
		}
		Arrays.sort(arr);
		int l=0;
		int[] arr1=new int[arr.length];
		for(int i=0;i<length;i++) {
			int count=0;
			for(int j=i+1;j<length;j++) {
				if(arr[i]==arr[j]) {
					count++;
				}
			}
			if(count==0) {
				arr1[l]=arr[i];
				l++;
			}
		}
		arr1=Arrays.copyOf(arr1,l);
		System.out.println("The sorted array without duplicates is : " + Arrays.toString(arr1));
		input.close();

	}

}
