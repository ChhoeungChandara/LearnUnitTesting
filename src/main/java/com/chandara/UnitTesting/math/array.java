package com.chandara.UnitTesting.math;

public class array {
	public static int findingMaxArray(int[] arr) {
		int max = Integer.MIN_VALUE;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]>max) {
				max = arr[i];
			}
		}
		return max;
		
	}
	public static int findingMinArray(int[] arr) {
		int min = Integer.MAX_VALUE;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]<min) {
				min = arr[i];
			}
		}
		return min;
	}

 
	public static int sumOfArray(int[] arr) {
		int sum = 0;
		for(int i : arr) {
			sum+=i;
		}
		return sum;
	}

}
