package Arrays;

import java.util.*;

public class AddElement {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.println("Enter the length of array:");
		int length= input.nextInt();
		System.out.println("Enter the " + length+ " elements:");
		int[] arr= new int[length];
		for(int i=0;i<length;i++) {
			arr[i]=input.nextInt();
		}
		System.out.println("The  current array is : " + Arrays.toString(arr));
		System.out.println("Enter a element too add to an array: ");
		int x=input.nextInt();
		arr= Arrays.copyOf(arr,length+1);
		arr[length]=x;
		System.out.println("The  current array is : " + Arrays.toString(arr));
		input.close();
	}

}
