package programmers.LV0.대소문자_바꿔서_출력하기;

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        String answer = "";

        for (char x : a.toCharArray()) {
            if (Character.isUpperCase(x)) answer += Character.toLowerCase(x);
            else answer += Character.toUpperCase(x);
        }
        System.out.println(answer);
    }
}
