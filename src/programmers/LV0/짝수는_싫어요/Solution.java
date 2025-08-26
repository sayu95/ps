package programmers.LV0.짝수는_싫어요;

import java.util.*;
class Solution {
    public List solution(int n) {
        ArrayList<Integer> answer = new ArrayList<>();
        for(int i=1; i<=n; i++) {
            if(i%2 == 1) answer.add(i);
        }
        return answer;
    }
}
