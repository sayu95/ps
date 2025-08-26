package sayu.배열_만들기_2;

import java.util.*;

class Solution {
    public List solution(int l, int r) {
        List<Integer> answer = new ArrayList<>();
        for (int i = l; i <= r; i++) {
            boolean b = true;
            String str = String.valueOf(i);
            for (char c : str.toCharArray()) {
                if (c != '5' && c != '0') {
                    b = false;
                }
            }
            if (b) answer.add(i);
        }
        if (answer.isEmpty()) answer.add(-1);
        return answer;
    }
}
