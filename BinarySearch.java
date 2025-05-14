//$Id$
package com.dsa;

public class BinarySearch {

	public static void main(String[] args) {
		
		int arr[] = {1,2,3,4,5,6,7,8,9};
		int res = binarySearch(arr, 9, 0, arr.length-1);
		System.out.println(res);
		
		int arr2[] = {9,8,7,6,5,4,3,2,1};
		boolean result = binarySearchOA(arr2, 4, 0, arr2.length-1);
		System.out.println(result);
	}

	private static boolean binarySearchOA(int[] arr, int target, int start, int end) {
		
		// This will work based on the Order of the array. first check the array order and search the target.
		
		boolean asc = false;
		
		if(arr[start] < arr[end]) {
			asc = true;
		}
		while(start <= end) {

			int mid = (start+end)/2;
			if(asc) {
				if(target > arr[mid]) {
					start = mid+1;
				}
				else if(target < arr[mid]) {
					end = mid-1;
				}
				else {
					return true;
				}
			}
			else {
				if(target > arr[mid]) {
					end = mid-1;
				}
				else if(target < arr[mid]){
					start = mid+1;
				}
				else {
					return true;
				}
			}
		}
		return false;
	}

	private static int binarySearch(int[] arr, int target, int start, int end) {
		int center = (start+end)/2;

		if(arr[center] == target) {
			return center;
		}
		else if(target > arr[center]) {
			start = center+1;
			return binarySearch(arr, target, start, end);
		}
		else if(target < arr[center]) {
			end = center-1;
			return binarySearch(arr, target, start, end);
		}
		return -1;
		
	}

}
