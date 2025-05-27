class Solution {
    public int[] solution(int start_num, int end_num) {
        int len = start_num - end_num + 1; //10-3=7 3까지 포함하므로 7+1=8
        int[] answer = new int[len];
        
        //0~7까지 8번
        for(int i=0; i<len; i++) {
            //10-0=10
            //10-1=9
            //10-2=8
            //...
            //10-7=3
            answer[i] = start_num - i;
        }
        
        return answer;
    }
}