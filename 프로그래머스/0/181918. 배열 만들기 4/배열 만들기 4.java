import java.util.ArrayList;

class Solution {
    public int[] solution(int[] arr) {
        ArrayList<Integer> stk = new ArrayList<>();
        int i = 0;
        
        while(i < arr.length) {
            if (stk.isEmpty()) {
                stk.add(arr[i]);
                i++;
            } else {
                int last = stk.get(stk.size() -1);
                if (last < arr[i]) {
                    stk.add(arr[i]);
                    i++;
                } else {
                    stk.remove(stk.size() -1);
                }
            }
        }
        
        int[] result = new int[stk.size()];
        for(int j = 0; j<stk.size(); j++) {
            result[j] = stk.get(j);
        }
        return result;
    }
}