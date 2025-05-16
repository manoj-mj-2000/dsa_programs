//$Id$
package com.dsa;

import java.util.Arrays;

public class MergeSort {

	public static void main(String[] args) {
		
		int[] arr = {5,4,8,9,2,3,64,12,43,67,34,1};
		mergeSortByRef(arr, 0, arr.length);
		
		System.out.println(Arrays.toString(arr));
	}

	private static int[] mergeSort(int[] arr) {
		
		if(arr.length==1)
			return arr;
		
		int mid = arr.length/2;
		
		int[] left = mergeSort(Arrays.copyOfRange(arr, 0, mid));
		int[] right = mergeSort(Arrays.copyOfRange(arr, mid, arr.length));		
		
		return merge(left, right);
	}

	private static int[] merge(int[] left, int[] right) {
		
		int[] joined = new int[left.length+right.length];
		int i=0,j=0,k=0;
		
		while(i<left.length && j<right.length) {
			if(left[i] < right[j]) 
				joined[k++] = left[i++];
			else
				joined[k++] = right[j++];
		}
		
		while(i<left.length) {
			joined[k++] = left[i++];
		}
		while(j<right.length) {
			joined[k++] = right[j++];
		}
		
		return joined;
	}
	
	private static void mergeSortByRef(int[] arr, int start, int end) {
		
		if(end-start == 1)
			return;
		
		int mid = (start+end)/2;
		
		mergeSortByRef(arr, start, mid);
		mergeSortByRef(arr, mid, end);
		 
		mergeByRef(arr, start, mid, end);
	}

	private static void mergeByRef(int[] arr, int start, int mid, int end) {
		int[] joined = new int[end-start];
		int i=start,j=mid,k=0;
		
		while(i<mid && j<end) {
			if(arr[i] > arr[j]) 
				joined[k++] = arr[i++];
			else
				joined[k++] = arr[j++];
		}
		
		while(i<mid) {
			joined[k++] = arr[i++];
		}
		while(j<end) {
			joined[k++] = arr[j++];
		}
		
		for(k=0; k<joined.length; k++) {
			arr[start+k] = joined[k]; 
		}
		
	}

}
