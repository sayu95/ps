package programmers.LV0.수열과_구간_쿼리_3;

class Solution {
    public int[] solution(int[] arr, int[][] queries) {
        int[] answer = new int[arr.length];
        for (int i = 0; i < queries.length; i++) {
            int ex1 = queries[i][0];
            int ex2 = queries[i][1];
            int temp = arr[ex1];
            arr[ex1] = arr[ex2];
            arr[ex2] = temp;
        }
        for (int i = 0; i < arr.length; i++) answer[i] = arr[i];
        return answer;
    }
}
