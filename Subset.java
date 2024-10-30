package Arrays;

import java.util.*;

public class Subset {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.println("Enter the length of array:");
		int length= input.nextInt();
		System.out.println("Enter the " + length+ " elements:");
		int[] arr= new int[length];
		for(int i=0;i<length;i++) {
			arr[i]=input.nextInt();
		}
		System.out.println("Enter the length of subset array:");
		int length1= input.nextInt();
		System.out.println("Enter the " + length1+ " elements:");
		int[] arr1= new int[length1];
		for(int i=0;i<length1;i++) {
			arr1[i]=input.nextInt();
		}
		int count=0;
		for(int i=0;i<length1;i++) {
			if(length1>length) break;
			boolean sub=false;
			for(int j=0;j<length;j++) {
				if(arr1[i]==arr[j]) {
					sub=true;
					break;
				}
			}
			if(sub) {
				count++;
			}
		}
		if(count==length1) {
			System.out.println("The second array is subset of first array");
		}
		else {
			System.out.println("The second array is not a subset of first array");
		}
		input.close();
	}
}
