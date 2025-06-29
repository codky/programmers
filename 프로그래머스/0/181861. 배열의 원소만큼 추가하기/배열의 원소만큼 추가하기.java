import java.util.*;

class Solution {
    public int[] solution(int[] arr) {
        List<Integer> result = new ArrayList<>();
        
        for (int a : arr) {
            for (int i = 0; i < a; i++) {
                result.add(a);
            }
        }
        
        //List<Integer> -> int[] 로 변환
        return result.stream().mapToInt(Integer::intValue).toArray();
    }
}