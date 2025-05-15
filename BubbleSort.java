//$Id$
package com.dsa;

import java.util.Arrays;

public class BubbleSort {

	public static void main(String[] args) {
		int[] arr = {5,4,8,9,2,3,64,12,43,67,34,1};
		
		bubbleSortAsc(arr);
		System.out.println(Arrays.toString(arr));
		
		bubbleSortDesc(arr);
		System.out.println(Arrays.toString(arr));
	}

	private static void bubbleSortDesc(int[] arr) {
		int n=arr.length;
		for(int i=1;i<n;i++) {
			boolean swapped = false;
			for(int j=0;j<n-i;j++) {
				if(arr[j] < arr[j+1]) {
					swapped = true;
					int temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
				}
			}
			if(!swapped) {
				break;
			}
		}
	}

	private static void bubbleSortAsc(int[] arr) {
		int n=arr.length;
		for(int i=1;i<n;i++) {
			boolean swapped = false;
			for(int j=0;j<n-i;j++) {
				if(arr[j] > arr[j+1 ]) {
					swapped = true;
					int temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
				}
			}
			if(!swapped) {
				break;
			}
		}
	}

}
