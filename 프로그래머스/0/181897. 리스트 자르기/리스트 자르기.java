class Solution {
    public int[] solution(int n, int[] slicer, int[] num_list) {
        int start = n == 1 ? 0 : slicer[0]; //n=1이면 0번 인덱스, n!=1이면 a번 인덱스
        int end = n == 2 ? num_list.length - 1 : slicer[1]; //n=2이면 마지막인덱스까지, n!=2이면 b번 인덱스까지
        int step = n == 4 ? slicer[2] :  1; //n=4면 c간격, n!=4면 1
        
        int[] answer = new int[(end - start + step) / step];
        for (int i = start, j = 0; i <= end; i += step) {
            answer[j++] = num_list[i];
        }
        
        return answer;
    }
}