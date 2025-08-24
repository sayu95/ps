package programmers.LV0.중앙값_구하기;

import java.util.Arrays;

class Solution {
    public int solution(int[] array) {
        int answer;
        Arrays.sort(array);
        answer = array[array.length / 2];
        return answer;
    }
}
