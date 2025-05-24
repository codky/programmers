import java.util.Arrays;

class Solution {
    public String[] solution(String my_string) {
        int len = my_string.length();
        String[] answer = new String[len];
        
        //문자열 my_string의 모든 접미사
        for(int i = 0; i < len; i++) {
            //i번째 문자부터 끝까지잘라서 접미사 생성
            answer[i] = my_string.substring(i); 
        }
        //접미사를 사전순 정렬
        Arrays.sort(answer);
        
        return answer;
    }
}