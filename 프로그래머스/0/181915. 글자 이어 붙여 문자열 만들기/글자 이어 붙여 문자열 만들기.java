class Solution {
    public String solution(String my_string, int[] index_list) {
        StringBuilder answer = new StringBuilder();
        char[] strArr = my_string.toCharArray();
        
        for(int index : index_list) {
            answer.append(strArr[index]);
        }
        
        return answer.toString();
    }
}