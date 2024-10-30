package Arrays;

import java.util.*;

public class RankingArray {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.println("Enter the length of array:");
		int length= input.nextInt();
		System.out.println("Enter the " + length+ " elements:");
		int[] arr= new int[length];
		for(int i=0;i<length;i++) {
			arr[i]=input.nextInt();
		}
		System.out.println("The Original Array is: " + Arrays.toString(arr));
		int[] arr1 =Arrays.copyOf(arr, length);
		Arrays.sort(arr1);
		int l=0;
		int[] arr2=new int[arr1.length];
		for(int i=0;i<length;i++) {
			int count=0;
			for(int j=i+1;j<length;j++) {
				if(arr1[i]==arr1[j]) {
					count++;
				}
			}
			if(count==0) {
				arr2[l]=arr1[i];
				l++;
			}
		}
		arr2=Arrays.copyOf(arr2,l);
		int[] rankArr= new int[length];
		for(int i=0; i<arr.length;i++) {
			for(int j=0 ;j<arr2.length;j++) {
				if(arr[i]==arr2[j]) {
					rankArr[i]=j+1;
				}
			}
		}
		System.out.println("The Ranking Of The Array is: " + Arrays.toString(rankArr));
		input.close();
	}

}
