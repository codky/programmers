import java.util.*;

class Solution {
    public String[] solution(String myString) {
        // "x" 기준으로 나누지만 빈 문자열은 포함
        String[] parts = myString.split("x");
        
        //빈 문자열 제거
        List<String> list = new ArrayList<>();
        for(String part : parts) {
            if(!part.isEmpty()) {
                list.add(part);
            }
        }
        
        //사전순 정렬
        Collections.sort(list);
        
        //List를 배열로 변환
        return list.toArray(new String[0]);
    }
}