import java.util.Arrays;

class Solution {
    public int solution(int[] arr) {
        int count = 0;
        
        while(true) {
            int[] before = Arrays.copyOf(arr, arr.length);//이전 상태 복사
            
            for(int i = 0; i < arr.length; i++) {
                if(arr[i] >= 50 && arr[i] % 2 == 0) {
                    arr[i] /= 2;
                } else if(arr[i] < 50 && arr[i] % 2 != 0) {
                    arr[i] = arr[i] * 2 + 1;
                }
                //나머지는 유지
            }
            
            if (Arrays.equals(arr, before)) {
                break;
            }
            
            count++;
        }
        
        return count;
    }
}