package baekjoon.대표값2;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int[] arr = new int[5];
		int ct = 0;
		int avg = 0;

		for(int i=0; i<arr.length; i++) {
			arr[i] = Integer.parseInt(br.readLine());
			avg += arr[i];
		}

		Arrays.sort(arr);

		ct = arr[arr.length / 2];
		avg = avg / arr.length;

		br.close();
		bw.flush();
		bw.write(avg + "\n");
		bw.write(ct + "");
		bw.close();
	}
}
