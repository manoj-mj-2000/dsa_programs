//$Id$
package com.dsa;

import java.util.Arrays;

public class QuickSort {

	public static void main(String[] args) {
		
		int[] arr = {5,4,8,9,2,3,64,12,43,67,34,1};
		
		quickSort(arr,0,arr.length-1);
		System.out.println(Arrays.toString(arr));
	}

	private static void quickSort(int[] arr, int low, int high) {
		
		if(low>=high)
			return;
		
		int s = low;
		int e = high;
		int m = (s+e)/2;
		int pivot = arr[m];
		
		while(s<=e) {
			
			while(arr[s]<pivot)
				s++;
			while(arr[e]>pivot)
				e--;
			
			if(s<=e) {
				int temp = arr[s];
				arr[s] = arr[e];
				arr[e] = temp;
				s++;
				e--;
			}
			
		}
		
		quickSort(arr, low, e);
		quickSort(arr, s, high);
	}

}
