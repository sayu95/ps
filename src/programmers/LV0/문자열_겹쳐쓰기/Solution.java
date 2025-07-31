package programmers.LV0.문자열_겹쳐쓰기;

class Solution {
    public String solution(String my_string, String overwrite_string, int s) {
        String answer = "";
        for (int i = 0; i < s; i++) {
            char[] c = my_string.toCharArray();
            answer += c[i];
        }
        for (char c : overwrite_string.toCharArray()) {
            answer += c;
        }
        for (int i = answer.length(); i < my_string.length(); i++) {
            char c = my_string.charAt(i);
            answer += c;
        }
        return answer;
    }
}

