import java.util.*;

class Solution {
    public List<String> solution(String[] str_list) {
        for(int i=0; i<str_list.length; i++) {
            String s = str_list[i];
            if (s.equals("l")) {
                return Arrays.asList(Arrays.copyOfRange(str_list, 0, i));
            } else if (s.equals("r")) {
                return Arrays.asList(Arrays.copyOfRange(str_list, i+1, str_list.length));
            }
        }
        return new ArrayList<>(); //l, r이 없는 경우
    }
}