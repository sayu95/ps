package baekjoon.별_찍기_2;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int star = Integer.parseInt(br.readLine());

		for(int i=1; i<=star; i++) { //행 출력
			for(int j=1; j<=star-i; j++) { //공백 출력
				bw.write(" ");
			}

			for(int k=1; k<=i; k++) { //별 출력
				bw.write("*");
			}
			bw.newLine();
		}
		bw.flush();
		bw.close();
		br.close();
	}
}
