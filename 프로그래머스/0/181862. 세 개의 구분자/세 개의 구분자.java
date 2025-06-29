import java.util.*;

class Solution {
    public String[] solution(String myStr) {     
        //"a" 또는 "b" 또는 "c"를 구분자로 split
        String[] parts = myStr.split("[abc]");
        
        //빈 문자열 제거
        List<String> result = new ArrayList<>();
        for (String part : parts) {
            if (!part.isEmpty()) {
                result.add(part);
            }
        }
        
        //없으면 ["EMPTY"]
        if (result.isEmpty()) {
            return new String[]{"EMPTY"};
        }
        
        return result.toArray(new String[0]);
    }
}