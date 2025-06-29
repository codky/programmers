import java.util.*;

class Solution {
    public int[] solution(int[] arr, int k) {
        //중복된 수를 거르기위해 Set(중복 저장 불가)
        Set<Integer> set = new HashSet<>();
        
        //결과를 담을 리스트(순서유지 List)
        List<Integer> result = new ArrayList<>();
        
        for (int num : arr) {
            //set에 해당 숫자가 없으면(처음등장한 숫자)
            if (!set.contains(num)) {
                set.add(num); //중복방지를위해 set에 추가
                result.add(num); //결과에 추가
                
                //k개의 숫자를 모았으면 반복 종료
                if (result.size() == k) break;
            }
            
            //이미 set에 존재하면 무시
        }
        
        //result길이가 k보다 작으면, 부족한 경우 -1로 채움
        while (result.size() < k) {
            result.add(-1);
        }
        //List<Integer>를 int[]로 변환
        return result.stream().mapToInt(Integer::intValue).toArray();
    }
}