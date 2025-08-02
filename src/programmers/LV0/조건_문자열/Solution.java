package programmers.LV0.조건_문자열;

class Solution {
    public int solution(String ineq, String eq, int n, int m) {
        int answer = 0;
        if (ineq.equals("<")) {
            if (eq.equals("=")) {
                if (n <= m) answer = 1;
                return answer;
            } else {
                if (n < m) answer = 1;
                return answer;
            }
        } else {
            if (eq.equals("=")) {
                if (n >= m) answer = 1;
                return answer;
            } else {
                if (n > m) answer = 1;
                return answer;
            }
        }
    }
}
