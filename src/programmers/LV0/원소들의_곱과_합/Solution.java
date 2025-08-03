package programmers.LV0.원소들의_곱과_합;

class Solution {
    public int solution(int[] num_list) {
        int answer = 0, add = 0, mul = 1;
        for (int n : num_list) {
            add += n;
            mul *= n;
        }
        add = (int) Math.pow(add, 2);
        if (add > mul) answer = 1;
        return answer;
    }
}
