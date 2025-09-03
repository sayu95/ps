package baekjoon.주사위_세개;

import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int non1 = Integer.parseInt(br.readLine());
        int non2 = Integer.parseInt(br.readLine());
        int non3 = Integer.parseInt(br.readLine());
        int result = 0;
        //같은 눈이 3개가 나오면 10,000원+(같은 눈)×1,000원의 상금을 받게 된다.
        if(non1 == non2 && non2 == non3) result = 10000 + non1 * 1000;
        //같은 눈이 2개만 나오는 경우에는 1,000원+(같은 눈)×100원의 상금을 받게 된다.
        if(non1 == non2 && non2 != non3) result = 1000 + non1 * 100;
        else if (non1 == non3 && non2 != non1) result = 1000 + non1 * 100;
        else if (non2 == non3 && non2 == non1) result = 1000 + non1 * 100;
        //모두 다른 눈이 나오는 경우에는 (그 중 가장 큰 눈)×100원의 상금을 받게 된다.
        if(non1 != non2 && non2 != non3) {
            int max = non1;
            if(max < non2) {
                max = non2;
                bw.write(max+"");
            }
            if(max < non3) {
                max = non3;
                bw.write(max+"");
            }
        }
    }
}
