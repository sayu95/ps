package programmers.LV0.마지막_두_원소;

class Solution {
    public int[] solution(int[] num_list) {
        int[] answer = new int[num_list.length + 1];
        int sum = 0;

        for (int i = 0; i < num_list.length; i++) {
            answer[i] = num_list[i];
        }

        int index_max = num_list.length - 1;

        if (num_list[index_max] > num_list[index_max - 1]) {
            sum = num_list[index_max] - num_list[index_max - 1];
        } else sum = num_list[index_max] * 2;

        answer[index_max + 1] = sum;
        return answer;
    }
}
