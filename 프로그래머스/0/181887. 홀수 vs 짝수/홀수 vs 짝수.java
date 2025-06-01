class Solution {
    public int solution(int[] num_list) {
        int evenAnswer = 0;
        int oddAnswer = 0;
        
        for (int i = 0; i< num_list.length; i++) {
            if(i % 2 == 0) {
                oddAnswer+=num_list[i];
            } else {
                evenAnswer+=num_list[i];
            }            
        }
        return Math.max(evenAnswer, oddAnswer);
    }
}