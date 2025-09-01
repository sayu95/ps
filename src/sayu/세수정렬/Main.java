package sayu.세수정렬;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int[] arr = new int[3];

		for(int i=0; i<arr.length; i++) {
			arr[i] = scan.nextInt();
		}

		for(int i=0; i<arr.length; i++) {
			int minIndex = i;
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[j] < arr[minIndex]) {
					minIndex = j;
				}
			}
			int temp = arr[minIndex];
			arr[minIndex] = arr[i];
			arr[i] = temp;
		}
		for(int k : arr) { 
			System.out.printf(k+" ");
		}
	}
}
