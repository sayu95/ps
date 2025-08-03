package programmers.LV0.이어_붙인_수;

class Solution {
    public int solution(int[] num_list) {
        int answer = 0;
        String even = "", odd = "";
        for (int n : num_list) {
            if (n % 2 == 0) even += Integer.toString(n);
            else odd += Integer.toString(n);
        }
        answer = Integer.parseInt(even) + Integer.parseInt(odd);
        return answer;
    }
}
