package practise;

import java.util.Scanner;
import java.util.Stack;

public class AntiSpiralMatrix {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int R = sc.nextInt();
		int C = sc.nextInt();
		
		int matrix[][] = new int[R][C];
		
		try {
			for (int i = 0; i < R; i++) {
				for (int j = 0; j < C; j++) {
					matrix[i][j]=sc.nextInt();
				}
			}
		} catch (Exception e) {
			System.out.println(e.getMessage());
		} finally {
			sc.close();
		}
		
		printMatrix(matrix);
		
		antiSpiralMatrix(matrix, R-1, C-1);
		
	}
	
	public static void antiSpiralMatrix(int[][] arr, int row, int col) {
		int left=0;
		int top=0;
		int i;
		
		Stack<Integer> stack = new Stack<>();
		
		while (left<=row && top<=col) {
			
			for (i =top; i <= row; i++) {
				stack.push(arr[left][i]);
			}
			left++;
			
			for(i=left;i<=col;i++) {
				stack.push(arr[i][col]);
			}
			col--;
			
			if (left<=row) {
				for(i=col;i>=top;--i) {
					stack.push(arr[row][i]);
				}
				row--;
			}
			
			if(top<=col) {
				for (i = row; i >=left; --i) {
					stack.push(arr[i][top]);
				}
				top++;
			}
		}
		
		System.out.println("stack size: "+stack.size());
		 while(!stack.isEmpty()){
             Integer pop = stack.pop();
             System.out.print(pop+" ");

         }
	}
	
	public static void printMatrix(int[][] arr) {
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
	}

}
