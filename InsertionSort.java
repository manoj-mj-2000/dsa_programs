//$Id$
package com.dsa;

import java.util.Arrays;

public class InsertionSort {

	public static void main(String[] args) {

		int[] arr = {5,4,8,9,2,3,64,12,43,67,34,1};
		
		insertionSortAsc(arr);
		
		insertionSortDesc(arr);
	}

	private static void insertionSortAsc(int[] arr) {
		int n= arr.length;
		for(int i=1;i<n;i++) {
			
			for(int j=i;j>0;j--) {
				
				if(arr[j] < arr[j-1]) {
					int temp = arr[j];
					arr[j] = arr[j-1];
					arr[j-1] = temp;
				}
				else {
					break;
				}
				
			}
		}
		System.out.println(Arrays.toString(arr));
	}

	private static void insertionSortDesc(int[] arr) {
		
		int n= arr.length;
		for(int i=1;i<n;i++) {
			
			for(int j=i;j>0;j--) {
				
				if(arr[j] > arr[j-1]) {
					int temp = arr[j];
					arr[j] = arr[j-1];
					arr[j-1] = temp;
				}
				else {
					break;
				}
				
			}
		}
		System.out.println(Arrays.toString(arr));
	}

}
