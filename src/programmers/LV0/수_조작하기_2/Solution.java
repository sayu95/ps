package programmers.LV0.수_조작하기_2;

class Solution {
    public String solution(int[] numLog) {
        String answer = "";
        int num = 0;
        for(int i : numLog) {
            if(num - i == -1) answer += "w";
            else if(num - i == 1) answer += "s";
            else if(num - i == -10) answer += "d";
            else if(num - i == 10) answer += "a";
            num = i;
        }
        return answer;
    }
}