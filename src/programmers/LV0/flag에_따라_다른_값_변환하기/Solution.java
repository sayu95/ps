package programmers.LV0.flag에_따라_다른_값_변환하기;

class Solution {
    public int solution(int a, int b, boolean flag) {
        int answer = 0;
        if (flag) {
            answer = a + b;
        } else answer = a - b;
        return answer;
    }
}
