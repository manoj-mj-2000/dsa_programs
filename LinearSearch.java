//$Id$
package com.dsa;

import java.util.Arrays;

public class LinearSearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = new int[]{1,3,5,2,7,4,0,9};
		System.out.println(findIndex(arr, 5));
		System.out.println(findIndex("Manoj", 'j'));
		System.out.println(findMax(arr));
		System.out.println(findMin(arr));
		int[][] twoD = {
				{1,2,3},{4,5,6},{7,8,9}
		};
//		int[] resarr = findIn2DArray(twoD, 5); 
		System.out.println(Arrays.toString(findIn2DArray(twoD, 10)));
		
		System.out.println(countTheChar("Ramasamy", 'a'));
	}

	public static boolean find(int[] arr, int target) {
		int n=arr.length;
		for(int i=0; i<n; i++) {
			if(arr[i] == target)
				return true;
		}
		return false;
	}
	
	public static int findIndex(int[] arr, int target) {
		int n=arr.length;
		for(int i=0; i<n; i++) {
			if(arr[i] == target)
				return i;
		}
		return -1;
	}
	
	public static int findIndex(String str, char target) {
		int n = str.length();
		for(int i=0;i<n;i++) {
			if(str.charAt(i) == target)
				return i;
		}
		return -1;
	}
	
	public static int[] findIn2DArray(int[][] arr, int target) {
		
		for(int i=0; i<arr.length; i++) {
			for(int j=0;j<arr[i].length;j++) {
				if(arr[i][j] == target)
					return new int[] {i,j};
			}
		}
		return new int[] {-1,-1};
	}

	public static int findMax(int[] arr) {
		int n=arr.length;
		int max = Integer.MIN_VALUE;
		for(int i=0; i<n; i++) {
			if(arr[i] > max)
				max = arr[i];
		}
		return max;
	}
	
	public static int findMin(int[] arr) {
		int n=arr.length;
		int min = Integer.MAX_VALUE;
		for(int i=0; i<n; i++) {
			if(arr[i] < min)
				min = arr[i];
		}
		return min;
	}
	
	public static int countTheChar(String str, char target) {
		
		int count=0;
		int n = str.length();
		for(int i=0;i<n;i++) {
			if(str.charAt(i) == target)
				count++;
		}
		return count;
	}
	
}
