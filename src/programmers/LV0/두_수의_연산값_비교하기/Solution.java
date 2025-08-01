package programmers.LV0.두_수의_연산값_비교하기;

class Solution {
    public int solution(int a, int b) {
        int answer = 0;
        String str1 = Integer.toString(a);
        String str2 = Integer.toString(b);
        int num1 = Integer.parseInt(str1 + str2);
        int num2 = 2 * a * b;
        if (num1 > num2) answer = num1;
        else answer = num2;
        return answer;
    }
}
