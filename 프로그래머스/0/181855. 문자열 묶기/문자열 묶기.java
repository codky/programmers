import java.util.*;

class Solution {
    public int solution(String[] strArr) {
        Map<Integer, Integer> lengthCountMap = new HashMap<>();
        
        for (String str : strArr) {
            int len = str.length();
            lengthCountMap.put(len, lengthCountMap.getOrDefault(len, 0)+1);
        }
        
        int max = 0;
        for (int count : lengthCountMap.values()) {
            max = Math.max(max, count);
        }
        
        return max;
    }
}