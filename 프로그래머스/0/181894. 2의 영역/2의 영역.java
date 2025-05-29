import java.util.Arrays;

class Solution {
    public int[] solution(int[] arr) {
        int firstIndex = -1;
        int lastIndex = -1;
        
        //2가 있는 첫 위치와 마지막 위치 찾기
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 2) {
                if (firstIndex == -1) {
                    firstIndex = i;    
                }
                lastIndex = i;    
            }
            
        }
    
        //2가 없으면 [-1] 반환
        if (firstIndex == -1) {
            return new int[]{-1};
        }
    
        //firstIndex~lastIndex까지 서브배열 추출
        return Arrays.copyOfRange(arr, firstIndex, lastIndex + 1);
    }
}
