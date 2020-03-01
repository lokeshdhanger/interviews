package com.demo.arrays;


/**
 * sort the array of 0 and 1 i.e. all 0 on one side nd all 1 on other side
 * @author xarvis
 *
 */
public class SortZeroAndOnes {
	
	public static void main(String[] args) {
		
		int arr1[] = {0, 1, 0, 1, 0, 0, 1, 1, 1, 0};
		
		System.out.println("array");
		for (int i = 0; i < arr1.length; i++) {
			System.out.print(arr1[i]+" ");
		}
		
		//approach 1
		int countZero=0;
		for (int i = 0; i < arr1.length; i++) {
			if (arr1[i]==0) {
				++countZero;
			}
		}
		
		for (int i = 0; i < countZero; i++) {
			arr1[i]=0;
		}
		
		for (int i = countZero; i < arr1.length; i++) {
			arr1[i]=1;
		}
		
		System.out.println("first approach");
		for (int i = 0; i < arr1.length; i++) {
			System.out.print(arr1[i]+" ");
		}
		
		
		//approach 2
		int arr2[] = {0, 1, 0, 1, 0, 0, 1, 1, 1, 0};
		int first=0;
		int last=arr2.length-1;
		
		while (first<last) {
			if (arr2[first]==1) {
				int temp = arr2[first];
				arr2[first]=arr2[last];
				arr2[last]=temp;
				last--;
			} else {
				first++;
			}
		}
		
		System.out.println("\n2nd approach");
		for (int i = 0; i < arr2.length; i++) {
			System.out.print(arr2[i]+" ");
		}
		
	}

}
