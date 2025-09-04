package baekjoon.윷놀이;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		boolean[][] Yut = new boolean[3][4];
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st = null;

		for(int i=0; i<Yut.length; i++) {
			st = new StringTokenizer(br.readLine());
			for(int j=0; j<Yut[i].length; j++) {
				int stickValue = Integer.parseInt(st.nextToken());
				Yut[i][j] = (stickValue==1);
			}
		}

		for(boolean[] arr : Yut) {
			int b = 0;
			for(boolean i : arr) {
				if(i == false) b++;
			}
			if(b == 1) bw.write("A\n");
			else if(b == 2) bw.write("B\n");
			else if(b == 3) bw.write("C\n");
			else if(b == 4) bw.write("D\n");
			else bw.write("E\n");
		}
		br.close();
		bw.flush();
		bw.close();
	}
}
