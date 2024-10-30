package Arrays;

import java.util.*;

public class SearchElement {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.println("Enter the length of array:");
		int length= input.nextInt();
		System.out.println("Enter the " + length+ " elements:");
		int[] arr= new int[length];
		for(int i=0;i<length;i++) {
			arr[i]=input.nextInt();
		}
		System.out.println("Enetr a Element to search: ");
		int s=input.nextInt();
		/*int k=Arrays.binarySearch(arr, s);
		if(k<0) {
			System.out.println("Enter the valid element");
		}else {
			System.out.println("The element is in " + k+ " index");
		}*/
		int k=-1;
		for(int j=0;j<length;j++) {
			if(arr[j]==s) {
				k=j;
				break;
			}
		}
		if(k<0) {
			System.out.println("Enter the valid element");
		}else {
			System.out.println("The element is in " + k+ " index");
		}
		input.close();
	}
}
