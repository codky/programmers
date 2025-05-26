class Solution {
    public String solution(String my_string, int m, int c) {
        StringBuilder answer = new StringBuilder();
        int rows = my_string.length()/m;
        
        for(int i=0; i<rows; i++) {
            int index = i*m+(c-1);
            answer.append(my_string.charAt(index));
        }
        return answer.toString();
    }
}