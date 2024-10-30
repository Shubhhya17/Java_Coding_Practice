package Arrays;

import java.util.*;

public class RepeatedElement {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.println("Enter the length of array:");
		int length= input.nextInt();
		System.out.println("Enter the " + length+ " elements:");
		int[] arr= new int[length];
		for(int i=0;i<length;i++) {
			arr[i]=input.nextInt();
		}
		int[] arr1 =new int[length];
		int l=0;
		for(int i=0;i<length;i++) {
			int rep=0;
			for(int j=0;j<length;j++) {
				if(arr[i]==arr[j]) {
					rep++;
				}
			}
			if(rep>1) {
				arr1[l]=arr[i];
				l++;
			}
		}
		arr1=Arrays.copyOf(arr1,l);
		int x=0;
		int[] arr2=new int[arr1.length];
		for(int i=0;i<arr1.length;i++) {
			int count=0;
			for(int j=i+1;j<arr1.length;j++) {
				if(arr1[i]==arr1[j]) {
					count++;
				}
			}
			if(count==0) {
				arr2[x]=arr1[i];
				x++;
			}
		}
		arr2=Arrays.copyOf(arr2,x);
		System.out.println("The  repeated elements in array is : " + Arrays.toString(arr2));
		input.close();
	}
}
