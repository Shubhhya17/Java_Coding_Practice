package Arrays;

import java.util.*;

public class AscendingOrder {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.println("Enter the length of array:");
		int length= input.nextInt();
		System.out.println("Enter the " + length+ " elements:");
		int[] arr= new int[length];
		for(int i=0;i<length;i++) {
			arr[i]=input.nextInt();
		}
		System.out.println("The Ascending Oreder of array is : " + Arrays.toString(arr));
		//Arrays.sort(arr);  
		for(int i=0;i<length-1;i++) {
			for(int j=0;j<length-1;j++) {
				if(arr[j]>arr[j+1]) {
					int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
				}
			}
		}
		System.out.println("The Ascending Oreder of array is : " + Arrays.toString(arr));
		input.close();
	}

}
