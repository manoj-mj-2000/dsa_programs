//$Id$
package com.dsa;

import java.util.Arrays;

public class SelectionSort {

	public static void main(String[] args) {
		int[] arr = {5,4,8,9,2,3,64,12,43,67,34,1};
		
		selectionSortAsc(arr);
		selectionSortDesc(arr);
	}
	
	private static void selectionSortDesc(int[] arr) {
		int n= arr.length;
		for(int i=0;i<n; i++) {
			int maxIndex=i;
			for(int j=i+1; j<n; j++) {
				if(arr[j] > arr[maxIndex]) {
					maxIndex = j;
				}
			}
			int temp = arr[i];
			arr[i] = arr[maxIndex];
			arr[maxIndex] = temp;
		}
		
		System.out.println(Arrays.toString(arr));
	}

	public static void selectionSortAsc(int[] arr) {
		int n= arr.length;
		for(int i=0;i<n; i++) {
			int minIndex=i;
			for(int j=i+1; j<n; j++) {
				if(arr[j] < arr[minIndex]) { 
					minIndex = j;
				}
			}
			int temp = arr[i];
			arr[i] = arr[minIndex];
			arr[minIndex] = temp;
		}
		
		System.out.println(Arrays.toString(arr));
	}

}
