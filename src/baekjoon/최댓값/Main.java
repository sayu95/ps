package baekjoon.최댓값;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br =  new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw  = new BufferedWriter(new OutputStreamWriter(System.out));

		int[] arr = new int[9];
		int pos = 0;
		int max = Integer.MIN_VALUE;
		
		for(int i=0; i<arr.length; i++) {
			arr[i] = Integer.parseInt(br.readLine());
			if(max < arr[i]) {
				max = arr[i];
				pos = i+1;
			}
		}
		System.out.println(max);
		System.out.println(pos);
	}
}
