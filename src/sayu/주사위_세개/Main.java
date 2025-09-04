package sayu.주사위_세개;

import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int non1 = Integer.parseInt(st.nextToken());
        int non2 = Integer.parseInt(st.nextToken());
        int non3 = Integer.parseInt(st.nextToken());
        int result = 0;
        if (non1 == non2 && non2 == non3) result = 10000 + non1 * 1000; //로직이 지저분함
        if (non1 == non2 && non2 != non3) result = 1000 + non1 * 100;
        else if (non1 == non3 && non2 != non1) result = 1000 + non1 * 100;
        else if (non2 == non3 && non1 != non2) result = 1000 + non2 * 100;
        if (non1 != non2 && non2 != non3) {
            if(non1 != non3) { //Math.max 함수 쓰기
                int max = non1;
                if (max < non2) {
                    max = non2;
                }
                if(max < non3) {
                    max = non3;
                }
                result = max * 100;
            }
        }
        bw.write(result+"");
        bw.flush();
        br.close();
        bw.close();
    }
}
