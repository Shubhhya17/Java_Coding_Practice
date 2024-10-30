package Arrays;

import java.util.*;

public class Frequency {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.println("Enter the length of array:");
		int length= input.nextInt();
		System.out.println("Enter the " + length+ " elements:");
		int[] arr= new int[length];
		for(int i=0;i<length;i++) {
			arr[i]=input.nextInt();
		}
		boolean[] visited = new boolean[length];
		for(int i=0;i<length;i++) {
			if (visited[i]) continue; // Skip if already visited
			int count=0;
			for(int j=i+1;j<length;j++) {
				if(arr[i]==arr[j] ) {
					count++;
					visited[j] = true; // Mark duplicate elements as visited
				}
			}
			System.out.println("The element " + arr[i]+" repeated: " +count+ " times");
		}
		input.close();
	}

}
