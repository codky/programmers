class Solution {
    public String solution(String my_string, int s, int e) {
        //1. 앞부분 자르기
        String prefix = my_string.substring(0, s);
        //2. 뒤집을 부분 자르기
        String mid = my_string.substring(s, e+1);
        //3. 뒷부분 자르기
        String suffix = my_string.substring(e+1);
        
        //4. 문자열 뒤집기
        String reversed = new StringBuilder(mid).reverse().toString();
        
        return prefix + reversed + suffix;
    }
}