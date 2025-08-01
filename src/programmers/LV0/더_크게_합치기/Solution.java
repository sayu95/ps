package programmers.LV0.더_크게_합치기;

class Solution {
    public int solution(int a, int b) {
        int answer = 0;

        String str1 = Integer.toString(a) + Integer.toString(b);
        String str2 = Integer.toString(b) + Integer.toString(a);

        int x = Integer.parseInt(str1);
        int y = Integer.parseInt(str2);

        if(x > y) answer = x;
        else answer = y;

        return answer;
    }
}
