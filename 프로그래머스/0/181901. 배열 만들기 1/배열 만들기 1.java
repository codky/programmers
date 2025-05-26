import java.util.ArrayList;

class Solution {
    public int[] solution(int n, int k) {
        int size = n / k;  // k의 배수 개수
        int[] answer = new int[size];

        for (int i = 1; i <= size; i++) {
            answer[i - 1] = i * k;
        }
        return answer;
    }
}
