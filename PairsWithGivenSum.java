package com.demo.arrays;

import java.util.Arrays;

/**
 * when asked about pairs, think of this {a,b}
 * not {a,b,c} etc.
 * 
 * @author xarvis
 *
 */
public class PairsWithGivenSum {
	
	public static void main(String[] args) {
		
		int arr[] = {3,9,4,1,4,5,2,6};

		int low = 0;
		int high = arr.length-1;
		int sum = 10;
		
		Arrays.sort(arr);
		
		while (low<high) {
			if ((arr[low]+arr[high])==sum) {
				System.out.println("{"+arr[low]+", "+arr[high]+"}");
			}
			if ((arr[low]+arr[high])>sum) {
				high--;
			} else {
				low++;
			}			
		}		
	}

}
