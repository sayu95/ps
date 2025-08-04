package programmers.LV0.수_조작하기_1;

class Solution {
    public int solution(int n, String control) {
        int answer = 0;
        char[] c = control.toCharArray();
        for (char x : c) {
            if (x == 'w') n++;
            else if (x == 's') n--;
            else if (x == 'd') n += 10;
            else n -= 10;
        }
        answer = n;
        return answer;
    }
}