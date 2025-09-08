package baekjoon.홀수;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int min = Integer.MAX_VALUE;
		int result = 0;
		
		for(int i=1; i<=7; i++) {
			int num = Integer.parseInt(br.readLine());
			if(num % 2 == 1) {
				result += num;
				if(min > num) {
					min = num;
				}
			}
		}
		
		if(min == Integer.MAX_VALUE) min = -1;
		
		if(result != 0) {
			bw.write(result+"\n");
			bw.write(min+"");
		} else bw.write(min+"");
		
		br.close();
		bw.flush();
		bw.close();
	}
}
