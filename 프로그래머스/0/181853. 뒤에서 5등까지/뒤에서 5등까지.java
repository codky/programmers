import java.util.*;

class Solution {
    public int[] solution(int[] num_list) {
        Arrays.sort(num_list); //배열 오름차순
        
        int[] answer = new int[5];
        for(int i=0; i<5; i++) {
            answer[i] = num_list[i];
        }
        
        return answer;
    }
}