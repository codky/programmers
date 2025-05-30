class Solution {
    public int[] solution(int[] arr, int[][] intervals) {
        
        int a1 = intervals[0][0], b1 = intervals[0][1];
        int a2 = intervals[1][0], b2 = intervals[1][1];
        
        int len1 = b1 - a1 + 1;
        int len2 = b2 - a2 + 1;
        
        int[] result = new int[len1+len2];
        
        System.arraycopy(arr,a1,result,0,len1);
        System.arraycopy(arr,a2,result,len1,len2);
        
        return result;
    }
}