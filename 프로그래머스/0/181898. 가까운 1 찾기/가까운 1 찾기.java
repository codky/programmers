class Solution {
    public int solution(int[] arr, int idx) {
        for(int i = idx; i < arr.length; i++) {
            //[1,0,0,1,0,0], idx=4 
            //arr[4]=0 -> -1
            if (arr[i] == 1) {
                return i;
            }
        }
        return -1;
    }
}