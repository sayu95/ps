package programmers.LV0.두_수의_나눗셈;

class Solution {
    public int solution(int num1, int num2) {
        double answer = 0;
        answer = (double)num1 / (double)num2;
        answer *= 1000;
        return (int)answer;
    }
}
