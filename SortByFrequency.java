package Arrays;

import java.util.*;

public class SortByFrequency {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.println("Enter the length of array:");
		int length= input.nextInt();
		System.out.println("Enter the " + length+ " elements:");
		int[] arr= new int[length];
		for(int i=0;i<length;i++) {
			arr[i]=input.nextInt();
		}
		int[] dupArr = new int[length];
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
			dupArr[i]=count+1;
		}
		int dupArr1[]= new int[length];
		int count=0;
		for(int i=0;i<length;i++) {
			if(dupArr[i]!=0) {
				dupArr1[count]=dupArr[i];
				count++;
			}
		}
		dupArr1=Arrays.copyOf(dupArr1, count);
		int l=0;
		int[] unDup=new int[arr.length];
		for(int i=0;i<length;i++) {
			int countx=0;
			for(int j=i+1;j<length;j++) {
				if(arr[i]==arr[j]) {
					countx++;
				}
			}
			if(countx==0) {
				unDup[l]=arr[i];
				l++;
			}
		}
		unDup=Arrays.copyOf(unDup,l);
		for(int i=0;i<l-1;i++) {
			for(int j=0;j<l-1;j++) {
				if(dupArr[j]>dupArr[j+1]) {
					int temp = dupArr[j];
					dupArr[j] = dupArr[j + 1];
					dupArr[j + 1] = temp;
					int temp1=unDup[j];
					unDup[j]=unDup[j + 1];
					unDup[j + 1] = temp1;
				}
			}
		}
		System.out.println("The frequnce sorted array is: " + Arrays.toString(unDup));
		input.close();
	}

}
