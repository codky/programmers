import java.util.*;

class Solution {
    public int[] solution(int[] num_list, int n) {
        int[] answer = {};
        int[] prefix = Arrays.copyOfRange(num_list, n, num_list.length);
        int[] suffix = Arrays.copyOfRange(num_list, 0, n);
        
        answer = new int[num_list.length];
        
        int idx = 0;
        
        for(int i = 0; i < prefix.length; i++) {
            answer[idx++] = prefix[i];
        }
        
        for(int i = 0; i < suffix.length; i++) {
            answer[idx++] = suffix[i];
        }
        
        return answer;
    }
}