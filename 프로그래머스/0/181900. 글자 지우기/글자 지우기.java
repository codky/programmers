import java.util.HashSet;
import java.util.Set;

class Solution {
    public String solution(String my_string, int[] indices) {
        Set<Integer> removeSet = new HashSet<>();
        for (int idx : indices) {
            removeSet.add(idx);
        }
        
        StringBuilder answer = new StringBuilder();
        
        for(int i = 0; i < my_string.length(); i++) {
            if (!removeSet.contains(i)) {
                answer.append(my_string.charAt(i));
            }
        }
        
        return answer.toString();
    }
}