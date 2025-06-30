class Solution {
    public int[] solution(int[] arr) {
        int len = arr.length;
        
        //2의 거듭제곱이면 반환
        if ((len & (len-1)) == 0) {
            return arr;
        }
        
        //다음 2의 거듭제곱 찾기
        int pow = 1;
        while (pow < len) {
            pow *= 2;
        }
        
        //새 배열 만들고 기존 값 복사
        //System.arraycopy(원본배열, 원본시작인덱스, 대상배열, 대상시작인덱스, 복사길이)
        int[] answer = new int[pow];
        System.arraycopy(arr, 0, answer, 0, len);
        return answer;
    }
}