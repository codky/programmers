import java.util.ArrayList;
import java.util.List;

class Solution {
    public String[] solution(String[] strArr) {
        List<String> list = new ArrayList<>();
        
        for (String str : strArr) {
            if (!str.contains("ad")) {
                list.add(str);
            }
        }
        return list.toArray(new String[0]);
        //리스트를 String[]로 변환
        //자바 컴파일러가 어떤 타입 배열인지 알 수 있게 new String[0]
        //list.size()만큼 크기를 줘도 되지만, 0이 일반적이고, JVM이 내부적으로 최적화함->반환 타입 힌트를 주고 최적화를 유도
    }
}