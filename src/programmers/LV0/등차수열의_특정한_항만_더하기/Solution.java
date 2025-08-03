package programmers.LV0.등차수열의_특정한_항만_더하기;

class Solution {
    public int solution(int a, int d, boolean[] included) {
        int answer = 0;
        for (boolean b : included) {
            if (b) {
                answer += a;
            }
            a += d;
        }
        return answer;
    }
}
