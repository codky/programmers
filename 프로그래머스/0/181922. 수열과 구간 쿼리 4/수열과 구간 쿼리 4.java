import java.util.Arrays;

class Solution {
    public int[] solution(int[] arr, int[][] queries) {
        int[] answer = Arrays.copyOf(arr, arr.length);

        for (int[] query : queries) {
            int s = query[0];
            int e = query[1];
            int k = query[2];
            
            for (int j = s; j <= e; j++) {
                if (j % k == 0) {
                    answer[j]++;
                }
            }
        }
        
        return answer;
    }
}