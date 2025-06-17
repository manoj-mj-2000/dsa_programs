//$Id$
package com.leet;

public class KadanesAlgoLargestSumArray {

	public static void main(String[] args) {

    // Kadane's Algorithm to find the largest sum in the Array.

		int arr[] = {-2,1,-3,4,-1,2,1,-5,4};
		int res = maxSubArray(arr);
		System.out.println(res);
	}

	private static int maxSubArray(int[] arr) {
		int res = arr[0];
		int maxEnding = arr[0];
		
		for(int i=1;i<arr.length; i++) {
			int arri = arr[i];
			maxEnding = Math.max(maxEnding+arr[i], arr[i]);
			
			res =  Math.max(res, maxEnding);
			
		}
		return res;
	}

}
